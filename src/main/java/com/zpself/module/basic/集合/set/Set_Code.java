package com.zpself.module.basic.集合.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Code {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(null);
        set.remove(null);
        System.out.println(set);

    }
}
