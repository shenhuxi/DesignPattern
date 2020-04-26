package com.zpself.module.设计模式23.结构型模式.a适配器模式一.demo1_ObjectAdapter;


public class Adapter implements Targetable {
    private Source obj ;
    public Adapter(Source source){
        super();
        this.obj = source;
    }

    @Override
    public void method1() {
        obj.method1();
    }

    @Override
    public void method2() {
        System.out.println("Targetable调用了接口的方法：method2");
    }

    public static void main(String[] args) {
        Targetable adapter= new Adapter(new Source());
        adapter.method1();
        adapter.method2();
    }
}
