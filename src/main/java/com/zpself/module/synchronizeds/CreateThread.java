package com.zpself.module.duoxiancheng;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zengpeng
 * @date 2019/9/2
 */
public class CreateThread {
    private static ThreadPoolExecutor threadPool = PoolExecutor.getInstance();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------方式1----------匿名内部类");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1打印："+Thread.currentThread().getName());
            }
        });
        thread1.start();

        System.out.println("----------方式2.0----------lamda");
        Runnable runnable = () -> {
            System.out.println("线程2打印："+Thread.currentThread().getName());
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();


        System.out.println("----------方式3.0----------线程池");
        threadPool.execute(runnable);
        threadPool.execute(runnable);
        threadPool.execute(runnable);

        System.out.println("主线程打印："+Thread.currentThread().getName());
    }
}
