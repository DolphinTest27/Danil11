package Concurrent.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(6);


        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println("Это ранбл"),3, 3,TimeUnit.SECONDS );



        //нельзя вызывать метод шатдаун, так как он не весит в очереди
//        scheduledExecutorService.shutdown();
//        scheduledExecutorService.awaitTermination(30,TimeUnit.HOURS);
    }
}
