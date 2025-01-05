package Concurrent.ThreadPool;

import java.util.Optional;
import java.util.Queue;

public class PoolDemo extends Thread{
    private final Queue<Runnable> tasks;

    public PoolDemo(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true){
            Optional<Runnable>task=Optional.empty();
            synchronized (task){
                if (task.isEmpty()){
                    task=Optional.of(tasks.remove());
                }
                task.ifPresent(Runnable::run);
            }
        }

    }
}
