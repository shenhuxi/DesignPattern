package com.zpself.module.设计模式23.结构型模式.a适配器模式一.old.demo1_ClassAdapter;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("Targetable调用了接口的方法：method2");
    }

    public static void main(String[] args) {
        Targetable adapter= new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
