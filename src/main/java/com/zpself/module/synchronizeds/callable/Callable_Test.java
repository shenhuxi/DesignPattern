package com.zpself.module.synchronizeds.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class Callable_Test {
    private static ThreadPoolExecutor threadPool = com.zpself.module.duoxiancheng.PoolExecutor.getInstance();
    public static void main(String[] args) {
        Runnable r =() -> {
            System.out.println("执行了runable线程--stat");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行了runable线程--end");
        };
       //new Thread(r).start();

        Callable<String> c  = () -> {
            System.out.println("执行了Callable线程--stat");
            System.out.println("当前线程名称："+Thread.currentThread().getName());
            Thread.sleep(6000);
            System.out.println("执行了Callable线程--end");
            return "Callable结果";
        };
        FutureTask<String> future = new FutureTask<>(c);
        threadPool.execute(future);
        new Thread(future,"有返回值的线程").start();

        try {
            Thread.sleep(1000);
            System.out.println("hello begin");
            future.cancel(true);//如果没有执行完 ，直接取消任务
            if (!future.isCancelled()) {
                System.out.println(future.get());//这里是拿到返回值，会让主线程等待call线程执行完
                System.out.println(future.isDone());
                System.out.println("hello end");
            } else {
                System.out.println("cancel~");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
