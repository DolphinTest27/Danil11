package Concurrent.Qoee;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class BuyerThread implements Runnable {
    private final Semaphore cashBoxes;

    public BuyerThread(Semaphore cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
           cashBoxes.acquire();
            System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе" );
            sleep(5);

            cashBoxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}