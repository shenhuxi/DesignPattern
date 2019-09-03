package com.zpself.module.basic.多线程.同步;

import com.zpself.module.basic.多线程.PoolExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zengpeng
 * @date 2019/9/3
 */
public class TestSynchronized {

    static Demo d = new Demo();
    private static ThreadPoolExecutor threadPool = PoolExecutor.getInstance();
    public static void main(String[] args) {
        threadPool.execute(()->{
            while (true){
                print1();
            }
        });
        threadPool.execute(()->{
            while (true){
                print2();
            }
        });

    }

    public static void print1() {
        synchronized (d) {
            //锁对象可以是任意对象,但是被锁的代码需要保证是同一把锁,不能用匿名对象
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
        }

    }
    public static void print2 () {
        synchronized (d) {
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
        }
    }
}