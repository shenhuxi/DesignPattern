package com.zpself.module.basic.clone;

import lombok.Data;

import java.util.Objects;

/**
 * @author zengpeng
 * @date 2019/8/21
 */
public class Person implements Cloneable{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
