package com.zpself.module.synchronizeds.线程池.newFixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定长线程池，每当提交一个任务就创建一个线程，
 * 直到达到线程池的最大数量，这时线程数量不再变化，当线程发生错误结束时，线程池会补充一个新的线程
 */
public class NewFixedThreadPool_code {
    private NewFixedThreadPool_code(){}
    static class NewFixedThreadPool{
        final static ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
    }

    public static ExecutorService getExecutorService(){
        return NewFixedThreadPool.fixedExecutor;
    }

    public static void main(String[] args) {
        testFixedExecutor();
    }
    //测试NewFixedThreadPool
    private static void testFixedExecutor() {
        ExecutorService executorService = getExecutorService();
        for (int i = 0; i <6; i++) {
            final  int index = i;
            executorService.execute(()->{
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " index:" + index);
            });
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
