package Concurrent;

public class SimpleThread extends java.lang.Thread{
    @Override
    public void run() {
        System.out.println("Hello"+getName());
    }
}
