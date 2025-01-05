package Concurrent.TaskRandom;

import java.util.Queue;

import static java.lang.Thread.sleep;

public class ProducerThread implements Runnable{
    private final Queue<Integer>list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;

    }

    @Override
    public void run() {
        synchronized (list){
            while (true) {
                if (list.size()<10) {
                    int random = RandomUnit.getRandom();
                    list.add(random);
                    System.out.println("Producer adds value:" + random + " Size " + list.size());
                }else {
                    System.out.println("Producer does nothing");
                }
//                list.notifyAll();
                try {
                int randomWaitValue=20;
                System.out.println("Producer waits value:"+ randomWaitValue);
                list.wait(randomWaitValue);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  }
    }
}
