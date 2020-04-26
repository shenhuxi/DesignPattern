package com.zpself.module.设计模式23.创建型模式.c单例模式.懒汉;
/**
* @Description 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
* 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
* @author  ZengPeng
* @date  2020/4/26
**/
public class Singleton {
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
}