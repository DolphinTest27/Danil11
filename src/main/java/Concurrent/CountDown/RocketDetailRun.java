package Concurrent.CountDown;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRun implements Runnable {
    private final RocketDetail rocketDetail;
    private final CountDownLatch countDownLatch;

    public RocketDetailRun(RocketDetail rocketDetail, CountDownLatch countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Готовиться деталь: "+ rocketDetail);
        try {
            Thread.sleep(5);
            System.out.println("Деталь готова: "+rocketDetail);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
