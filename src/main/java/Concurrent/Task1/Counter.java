package Concurrent.Task1;

public class Counter {
    private static String description;
    private  static  int count;

public static void init(){
    synchronized (Counter.class){
        if (description==null){
        description="DaDa Description";
    }}


}
    public synchronized void increment(){
        synchronized (this.getClass()){
            count++;
        }
    }
    public synchronized void decrement(){
        count--;
    }
    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter: " + count;
    }
}
