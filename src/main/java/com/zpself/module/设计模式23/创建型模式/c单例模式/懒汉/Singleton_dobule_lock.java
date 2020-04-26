package com.zpself.module.设计模式23.创建型模式.c单例模式.懒汉;
/**
* @Description  这种方式采用双锁机制，安全且在多线程情况下能保持高性能。 【推荐】
* @author  ZengPeng
* @date  2020/4/26
**/
public class Singleton_dobule_lock {
    private volatile static Singleton_dobule_lock singleton;
    private Singleton_dobule_lock (){}
    public static Singleton_dobule_lock getSingleton() {
    if (singleton == null) {  
        synchronized (Singleton_dobule_lock.class) {
        if (singleton == null) {  
            singleton = new Singleton_dobule_lock();
        }  
        }  
    }  
    return singleton;  
    }  
}