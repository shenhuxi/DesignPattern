package com.zpself.module.duoxiancheng;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zengpeng
 * @date 2019/9/2
 */
public class ThreadTrait {
    private static ThreadPoolExecutor threadPool = PoolExecutor.getInstance();
    public static void main(String[] args) {
//-----------------------------守护线程：等被守护的线程执行完-------star----------------------------------------
        Runnable runnable2 = () -> {
            System.out.println("线程2打印："+Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable2);
        thread1.setDaemon(true);
        thread1.start();
        System.out.println(thread1.isInterrupted());
        thread1.run();

        Runnable runnable1 = () -> {
            System.out.println("线程1打印："+Thread.currentThread().getName());
        };
        threadPool.execute(runnable1);
//-----------------------------守护线程：等被守护的线程执行完-------end----------------------------------------



    }
}
