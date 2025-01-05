package Concurrent.Barrior;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRun implements Runnable {
    private final RocketDetail rocketDetail;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRun(RocketDetail rocketDetail, CyclicBarrier cyclicBarrier) {
        this.rocketDetail = rocketDetail;
        this.cyclicBarrier = cyclicBarrier;

    }

    @Override
    public void run() {
        System.out.println("Готовиться деталь: "+ rocketDetail);
        try {
            Thread.sleep(5_000);
            System.out.println("Деталь готова и ожидает: "+rocketDetail);
            cyclicBarrier.await();
            System.out.println("Деталь использована: "+rocketDetail);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
