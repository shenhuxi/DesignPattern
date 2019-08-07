package com.zpself.module.basic.fanxing;

/**
 * @author zengpeng
 * @date 2019/7/19
 * @see Targget
 */
public class Person implements Targget<Person> {
    Person jeck;
    @Override
    public Person getObject() {
        return jeck;
    }
}
