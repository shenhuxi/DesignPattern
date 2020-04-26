package com.zpself.module.设计模式23.创建型模式.c单例模式.懒汉;
/**
* @Description  这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
* @author  ZengPeng
* @date  2020/4/26
**/
public class Singleton_synchronized {
    private static Singleton_synchronized instance;
    private Singleton_synchronized (){}
    public static synchronized Singleton_synchronized getInstance() {
    if (instance == null) {  
        instance = new Singleton_synchronized();
    }  
    return instance;  
    }  
}