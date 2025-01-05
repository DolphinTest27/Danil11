package Concurrent.Task1;

public class CounterThread extends Thread {

  private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }


}
