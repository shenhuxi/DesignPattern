package com.zpself.module.设计模式23.结构型模式.a适配器模式一.demo1_InterfaceAdapter;


public class Adapter extends Source {

    @Override
    public void method1() {
        System.out.println("调用了Adapter的方法：method2");
    }

    @Override
    public void method2() {
        System.out.println("调用了Adapter的方法：method2");
    }

    public static void main(String[] args) {
        Targetable adapter= new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
