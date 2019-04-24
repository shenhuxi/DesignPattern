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
    private String name;
    private String rename;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String rename) {
        this.name = name;
        this.rename = rename;
    }
}
