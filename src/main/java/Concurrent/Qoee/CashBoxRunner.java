package Concurrent.Qoee;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class CashBoxRunner {
public static void main(String[] args) {
  //  BlockingQueue<CashBox> cashBoxes = new ArrayBlockingQueue<>(2,true,List.of(new CashBox()
      //      , new CashBox()));
    Semaphore cashBoxes = new Semaphore(2,true);

    List<Thread> threads = Stream.of(
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes),
                    new BuyerThread(cashBoxes))
            .map(Thread::new)
            .peek(Thread::start)
            .toList();
    for (Thread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}
