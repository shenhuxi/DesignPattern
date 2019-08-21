package com.zpself.module.basic.char_;

import java.util.Arrays;

/**
 * @author zengpeng
 * @date 2019/8/21
 */
public class TestChar {
    public static void main(String[] args) {
        char acY[]={'a', 'b', 'c',  'd', 'e', 'f', 'g'};
        int length = acY.length;
        System.out.println("-------java语言的下面几种数组复制方法中，哪个效率最高？  执行时间：纳秒");
        System.out.println("-------第四名:for循环 -------for的速度之所以最慢是因为下标表示法每次都从起点开始寻位到指定下标处");
        char forxunhuan[] = new char[length];
        long starfor = System.nanoTime();
        for (int i=0;i<acY.length ; i++) {
            forxunhuan[i]=acY[i];
        }
        System.out.println(System.nanoTime()-starfor);
        System.out.println("-------第一名:System.arraycopy-------native");

        char a[] = new char[length];
        long star = System.nanoTime();
        System.arraycopy(acY,0,a,0,length);
        System.out.println(System.nanoTime()-star);

        System.out.println("-------第二名:clone-------");
        long starClone = System.nanoTime();
        char[] clone = acY.clone();
        System.out.println(System.nanoTime()-starClone);

        System.out.println("-------第三名:Arrays.copyOf -------调用System.arraycopy");
        long starArrays = System.nanoTime();
        char[] arrays = Arrays.copyOf(acY, acY.length);
        System.out.println(System.nanoTime()-starArrays);



    }
}
