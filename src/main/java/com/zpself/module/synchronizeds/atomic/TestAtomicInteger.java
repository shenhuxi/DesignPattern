package com.zpself.module.synchronizeds.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
 
    static AtomicInteger ai2=new AtomicInteger(0);
    static Integer ai=new Integer(0);

    public void run() {
        for (int m = 0; m < 1000000; m++) {
            ai++;
        }
    }
};
 
public class TestAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(MyThread.ai);
    }
}