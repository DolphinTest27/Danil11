package Concurrent.Account;

public class AccountThread extends Thread {
  private final Account accountFrom;
  private final Account accountToo;

    public AccountThread(Account accountFrom, Account accountToo) {
        this.accountFrom = accountFrom;
        this.accountToo = accountToo;
    }

    @Override
    public void run() {

                for (int i = 0; i < 2000; i++) {
                    lockAccaunt();
                    //метод, чтобы захватить и отпускать мониторы обьектов
                    //безопасно, для многопоточности.
                    // чтобы не менялись с разных потоков одновременно и не было ошибок
                try {
                    if (accountFrom.takeOff(10)){
                        accountToo.add(10);
                    }
                    //в блоке try пишем код
                }finally {
                    accountFrom.getLock().unlock();
                    accountToo.getLock().unlock();
                    //отпускаем мониторы, чтобы в любом случае сработал, даже,
                    // если не получилось перевести
                    //если ошибка выскочит в методах takeOff и add, то будет DeadLock
                }
                }
            }

    private void lockAccaunt() {
        while (true){
            //создаём бесконечный цикл
            boolean fromLockResult = accountFrom.getLock().tryLock();
            boolean tooLockResult = accountToo.getLock().tryLock();
            if (fromLockResult&&tooLockResult){
                break;
            }
            if (tooLockResult){
                accountFrom.getLock().unlock();
                //обязательно чтобы разблокировать поток используем конструкцию if(для проверки, если захватили, то код выполняется)
                // мы не можем отпустить монитор если не захватили монитор этого обьекта
            }if (fromLockResult){
                accountToo.getLock().unlock();
                //обязательно чтобы разблокировать поток используем конструкцию if(для проверки, если захватили, то код выполняется)
                // мы не можем отпустить монитор если не захватили монитор этого обьекта
            }

        }
    }

}
