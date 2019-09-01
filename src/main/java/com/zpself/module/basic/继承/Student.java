package com.zpself.module.basic.继承;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author zengpeng
 * @date 2019/9/1
 */
@Data
public class Student extends Person {
    public int age=10;
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println( ( student).age);
        List a = new ArrayList();
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        };

        //1.8   lamda写法
        Comparator b = (o1, o2) -> o1.toString().compareTo(o2.toString());
    }
}
