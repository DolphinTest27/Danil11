package Concurrent.Task1;

import java.util.Arrays;

public class Demo implements Runnable {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);
        CounterThread counterThread5 = new CounterThread(counter);
        CounterThread counterThread6 = new CounterThread(counter);
        CounterThread counterThread7 = new CounterThread(counter);
        Demo demo=new Demo();
        Demo demo1=new Demo();
        Demo demo2=new Demo();
        Demo demo3=new Demo();

        counterThread1.getThreadGroup();
        for (CounterThread counterThread : Arrays.asList(counterThread1,counterThread2, counterThread3, counterThread4, counterThread5, counterThread6, counterThread7)) {
            counterThread.start();
            try {
                counterThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(counter);
        for (Demo demo4 : Arrays.asList(demo, demo1, demo2, demo3)) {
            demo4.run();
        }
        System.out.println(counter);

    }

    @Override
    public synchronized void run() {
        Counter counter=new Counter();
        for (int i = 0; i < 10000; i++) {
            counter.decrement();


        }
    }
}
