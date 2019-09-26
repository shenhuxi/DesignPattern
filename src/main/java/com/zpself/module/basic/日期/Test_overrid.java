package com.zpself.module.basic.日期;

import com.zpself.module.basic.继承.Person;

public class Test_overrid extends Person {
    @Override
    public int get(int a, int b) {
        return super.get(a, b);
    }
}
