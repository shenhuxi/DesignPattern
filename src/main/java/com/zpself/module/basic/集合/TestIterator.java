package com.zpself.module.basic.集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author zengpeng
 * @date 2019/9/2
 */
public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("22");
        list.add("42");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            iterator.add("31");
        }
        System.out.println("迭代结束list长度："+list.size());
    }
}
