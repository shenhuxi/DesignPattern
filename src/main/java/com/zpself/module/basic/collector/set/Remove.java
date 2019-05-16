package com.zpself.module.basic.collector.set;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zengpeng
 * @date 2019/5/8
 */
public class Remove {
    public static void main(String[] args) {
        removeSet();
    }

    /**
     * 测试removeAll方法
     */
    private static void removeSet(){
        Set<Integer> newInt = new HashSet<>(Lists.newArrayList(0,1,3));
        Set<Integer> copyNewInt = new HashSet<>(newInt);

        Set<Integer> oldInt = new HashSet<>(Lists.newArrayList(3,4,5));
        newInt.removeAll(oldInt);
        oldInt.removeAll(copyNewInt);
        System.out.println(newInt);
        System.out.println(oldInt);
    }
}
