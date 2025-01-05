package Concurrent.ThreadPool;

import java.util.concurrent.*;

public class FixPool {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        Future<Integer> submit = executorService.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Это колабл");
            return 1;
        });//на реальных примерах тредпулы почти никогда не завершаюь
        //но чтобы закрыть у тред пула есть метод шатдаун
        System.out.println(submit.get());//Get блокирует поток main
        //CompletableFuture<Integer> intFutureComp=new CompletableFuture<>();

       // System.out.println("Это комплитебл"+ integerCompletableFuture.getNow(15));


        executorService.shutdown();
        boolean b = executorService.awaitTermination(3, TimeUnit.HOURS);
        //через сколько максимум завершится этот фикспул либо пока не закончатся все задачи
        System.out.println(b);
        //завершает все потоки только после того как они выполнились
        System.out.println("Main End");
      //  executorService.shutdownNow();
        //сразу завершает все тредпулы, и возращает лист задач, которые не выполнились
    }
}
