package Concurrent;

import static java.lang.Thread.*;

public class Threadd {


    public static void main(String[] args) throws InterruptedException {
        var simpleThread=new SimpleThread();
        System.out.println(simpleThread.getName()+":"+simpleThread.getState());//состояние нашего потока
 // (new-новый, созданный, runnable-выполняется,blocked-заблокирован пока другой поток не выполнит,
        // waiting-ждёт, TimedWaiting-сколько ждать секунд(в метод джойн), Terminated-Поток завершился.)


      var lambdaThread = new Thread(() -> System.out.println("Hello from lambda"));
      //если не много кода, то можно использовать лямба

        var runnableThread = new Thread(new SimpleRunn());
        System.out.println(simpleThread.getName()+":"+simpleThread.getState());//состояние нашего потока

        simpleThread.start();
        System.out.println(simpleThread.getName()+":"+simpleThread.getState());//состояние нашего потока

        lambdaThread.start();//старт, чтобы запустить поток
        runnableThread.start();
      runnableThread.interrupt();//просип поток подождать.
        System.out.println(simpleThread.getName()+":"+simpleThread.getState());//состояние нашего потока

        simpleThread.join();
        System.out.println(simpleThread.getName()+":"+simpleThread.getState());//состояние нашего потока

        lambdaThread.join();
        runnableThread.join();
        //в том потоке который его вызвали, будет ждать,
        // пока обьект другого потока не закончит свое выполнение

        System.out.println(currentThread().getName());

    }
}
