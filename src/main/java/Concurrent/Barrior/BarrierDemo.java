package Concurrent.Barrior;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length,()-> System.out.println("Пуск!!"));
        ExecutorService executorService = Executors.newCachedThreadPool();
        Arrays.stream(RocketDetail.values())
                .map(detail->new RocketDetailRun(detail,cyclicBarrier))
                .forEach(executorService::submit);

        executorService.shutdown();
        boolean b = executorService.awaitTermination(4, TimeUnit.SECONDS);

    }
}
