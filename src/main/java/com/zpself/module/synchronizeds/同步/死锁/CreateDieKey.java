package com.zpself.module.synchronizeds.同步.死锁;

import com.zpself.module.synchronizeds.同步.Demo;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zengpeng
 * @date 2019/9/3
 */
public class CreateDieKey {
    private static ThreadPoolExecutor threadPool = com.zpself.module.duoxiancheng.PoolExecutor.getInstance();
    static final Demo KEY1 = new Demo();
    static final Demo KEY2 = new Demo();

    public static void main(String[] args) {
        Runnable r = ()->{
            while (true){
                synchronized(KEY1) {
                    System.out.println(Thread.currentThread().getName()+"：拿到了KEY1，正在请求KEY2...");
                    synchronized(KEY2) {
                        System.out.println(Thread.currentThread().getName()+"：拿到了KEY1，KEY2...执行结束");
                    }
                }
            }
        };
        Runnable r2 = ()->{
            while (true){
                synchronized(KEY2) {
                    System.out.println(Thread.currentThread().getName()+"：拿到了KEY2，正在请求KEY1...");
                    synchronized(KEY1) {
                        System.out.println(Thread.currentThread().getName()+"：拿到了KEY2，KEY1...执行结束");
                    }
                }
            }
        };
        threadPool.execute(r);
        threadPool.execute(r2);
        threadPool.execute(r);
        threadPool.execute(r2);
    }
}
