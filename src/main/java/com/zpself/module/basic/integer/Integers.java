package com.zpself.module.basic.integer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author zengpeng
 * @date 2019/8/14
 */
public class Integers {
    public static void main(String[] args) {

        //第二位进来与第一位比较，大与0  排在左边，小于0排在右边
        Comparator<Integer> swan = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a=  o1-o2;
                return a;
            }
        };

        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(3);
        l.add(2);
        l.sort(swan);
        System.out.println(l);
    }
   void count(int count){
       count = count+1;
    }
}
