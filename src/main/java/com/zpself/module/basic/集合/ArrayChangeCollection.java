package com.zpself.module.basic.集合;

import java.util.Arrays;
import java.util.List;

/**
 * @author zengpeng
 * @date 2019/9/2
 */
public class ArrayChangeCollection {
    public static void main(String[] args) {
        Integer[] a= {1,2,3,4,5};
        List<Integer> integers = Arrays.asList(a);
        System.out.println(integers);

        Integer[] integers1 = integers.toArray(new Integer[1]);
        for (Integer integer : integers1) {
            System.out.println(integer);
        }
    }
}
