package com.zpself.module.basic.克隆;

/**
 * @author zengpeng
 * @date 2019/8/21
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person xiaowei = new Person("徐小微",17);
        System.out.println(xiaowei);
        Person clonePerson = (Person)xiaowei.clone();
        System.out.println(clonePerson);

        System.out.println(clonePerson.equals(xiaowei));
        System.out.println(clonePerson==xiaowei);
    }
}
