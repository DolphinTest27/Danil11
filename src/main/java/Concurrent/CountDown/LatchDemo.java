package Concurrent.CountDown;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(RocketDetail.values().length);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Rocket1(countDownLatch));
        Arrays.stream(RocketDetail.values())
                .map(rocketDetail -> new RocketDetailRun(rocketDetail,countDownLatch))
                .forEach(executorService::submit);
        executorService.shutdown();
        boolean b = executorService.awaitTermination(5, TimeUnit.SECONDS);

    }
}
