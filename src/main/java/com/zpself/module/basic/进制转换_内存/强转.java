package com.zpself.module.basic.进制转换_内存;

/**
 * @author zengpeng
 * @date 2019/9/1
 */
public class 强转 {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 127;
        byte c= (byte) (a+b);
        System.out.println(c);
    }
}
