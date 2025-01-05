package Concurrent;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static void main(String[] args) {
        AtomicInteger atomicInteger=new AtomicInteger();
        atomicInteger.addAndGet(5);//добавь и дай
        int i = atomicInteger.incrementAndGet();//добавь 1
        System.out.println(atomicInteger);
      //  Unsafe unsafe = Unsafe.getUnsafe();
        atomicInteger.compareAndExchange(6,15);
        System.out.println(atomicInteger);
        int i1 = atomicInteger.accumulateAndGet(atomicInteger.compareAndExchange(15,22), Integer::max);
        System.out.println(atomicInteger);
        //можем напрямую создавать инстанс какого-то класса
        //рефлекшен API, размер по какому-то адрезу узнать,
        // или залоцировать какое-то количество памяти


    }
}
