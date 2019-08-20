package com.zpself.module.javac_javaa;

import org.springframework.core.MethodParameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author zengpeng
 * @date 2019/8/17
 */
public class Hello {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Hello.class.getMethod("testParam", String.class, Integer.class);
        MethodParameter nameParameter = new MethodParameter(method, 0);
        MethodParameter ageParameter = new MethodParameter(method, 1);

        Parameter nameOriginParameter = nameParameter.getParameter();
        Parameter ageOriginParameter = ageParameter.getParameter();
        nameOriginParameter.getName();
    }
    public  void testParam(String name ,int age){

    };
}
