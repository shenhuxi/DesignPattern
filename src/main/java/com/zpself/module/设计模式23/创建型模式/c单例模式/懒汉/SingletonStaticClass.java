package com.zpself.module.设计模式23.创建型模式.c单例模式.懒汉;
/**
* @Description  对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
* @author  ZengPeng
* @date  2020/4/26
 *
 * 登记式/静态内部类
**/
public class SingletonStaticClass {
    private static class SingletonHolder {  
    private static final SingletonStaticClass INSTANCE = new SingletonStaticClass();
    }  
    private SingletonStaticClass (){}
    public static final SingletonStaticClass getInstance() {
    return SingletonHolder.INSTANCE;  
    }  
}