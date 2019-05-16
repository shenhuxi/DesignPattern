package com.zpself.module.basic.collector.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zengpeng
 * @date 2019/4/24
 */
@Getter
@Setter
public class Person {
    /**
     *  名称
     */
    private String name;

    /**
     *  别名
     */
    private String sex;
    /**
     *
     年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age=age;
    }
    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
