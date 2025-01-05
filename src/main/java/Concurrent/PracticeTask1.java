package Concurrent;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PracticeTask1 {

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
          int second=  scanner.nextInt();
            if (second<0){
                break;
            }
            executorService.submit(()->{
                Integer counter = threadLocal.get();
                threadLocal.set(counter==null ? 1 : ++counter);
                System.out.println(String.format("Поток '%s' задач: '%d'",Thread.currentThread().getName(),threadLocal.get()));
                Thread.sleep(second*1000L);
                PrintStream printf = System.out.printf("Поток '%s' cпал '%d' секунд%n", Thread.currentThread().getName(), second);
                return second;
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);
    }
}
