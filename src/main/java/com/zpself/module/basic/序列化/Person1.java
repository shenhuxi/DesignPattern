package com.zpself.module.basic.序列化;

import java.io.Serializable;

class Person1 implements Serializable {
    public Person1() {

    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "  年龄：" + age;
    }

    // 注意这里
    private transient String name;
    private int age;
}