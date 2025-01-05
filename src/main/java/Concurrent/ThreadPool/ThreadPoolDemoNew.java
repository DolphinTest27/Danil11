package Concurrent.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class ThreadPoolDemoNew {
    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(5);
        Executors.newSingleThreadExecutor();



    Executors.newScheduledThreadPool(2);//поток задач.
        // есть возможность вписать параметры,
        // задержка и период выполнения
        Executors.newWorkStealingPool();

    }
}
