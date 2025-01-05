package Concurrent.CountDown;

import java.util.concurrent.CountDownLatch;

public class Rocket1 implements Runnable {
    private final CountDownLatch countDownLatch;

    public Rocket1(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        System.out.println("Ракета готовиться к запуску");
        try {
            countDownLatch.await();//ожидаем пока остальные детали не будут сделаны
            System.out.println("Пуск!!!");
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }
}
