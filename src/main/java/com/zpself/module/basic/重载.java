package com.zpself.module.basic;

/**
 * 函数名称相同，参数不同[个数或者类型]  就算重载
 * 与返回值无关
 * @author zengpeng
 * @date 2019/9/1
 */
public class 重载 {
    public void  test(int a,String b){
    }
    public void  test(String b,int a){
    }
    public int  test(int a,String b,int c){
        return  0b1;
    }

}
