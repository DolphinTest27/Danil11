package Concurrent;

public class SimpleRunn implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+=i);
            System.out.println("Hello run"+ java.lang.Thread.currentThread().getName());
        }
    }
}
