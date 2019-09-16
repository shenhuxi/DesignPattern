package com.zpself.module.duoxiancheng.线程池.newCachedThreadPool;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewCachedThreadPool_code {
    private NewCachedThreadPool_code(){}
    static class NewCachedThreadPool{
        final static ScheduledExecutorService  fixedExecutor = Executors.newScheduledThreadPool(3);
    }

    public static ScheduledExecutorService getExecutorService(){
        return NewCachedThreadPool_code.NewCachedThreadPool.fixedExecutor;
    }

    public static void main(String[] args) {
        testFixedExecutor();
    }
    //测试NewFixedThreadPool
    private static void testFixedExecutor() {
        ScheduledExecutorService executorService = getExecutorService();
        for (int i = 0; i <6; i++) {
            final  int index = i;
            executorService.scheduleWithFixedDelay(()->{
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " index:" + index);
            },0,3,TimeUnit.SECONDS);
        }

        try {
            //3秒时：前面三个线程睡觉3秒，前三打印完了
            //5秒时：打印主线程5秒后
            //6秒时：后面三个线程也睡觉3秒完成，打印
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5秒后...");
      executorService.shutdown();
    }
}
