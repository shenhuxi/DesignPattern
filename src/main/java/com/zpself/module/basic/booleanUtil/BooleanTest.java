package com.zpself.module.basic.booleanUtil;

/**
 * @author zengpeng
 * @date 2019/8/12
 */
public class BooleanTest {
    public static void main(String[] args) {
        BooleanTest test = new BooleanTest();
        Boolean b=true;
        test.changB(b);
        System.out.println(b);

    }
    public void changB(Boolean b){
        b=false;
    }
}
