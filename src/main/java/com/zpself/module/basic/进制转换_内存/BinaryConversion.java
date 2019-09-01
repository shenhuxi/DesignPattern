package com.zpself.module.basic.进制转换_内存;

/**
 * @author zengpeng
 * @date 2019/9/1
 */
public class BinaryConversion {
    public static void main(String[] args) {
        //1byte = 8bit;         1kb =1000byte    char=2 byte
        int a = 0b10101010;
        System.out.println("1.二进制数:"+a);
        int  b= 071;
        System.out.println("2.八进制数:"+b);
        int  c= 57;
        System.out.println("3.十进制数:"+c);
        int  d= 0x11;
        System.out.println("4.十六进制数:"+d);
    }
}
