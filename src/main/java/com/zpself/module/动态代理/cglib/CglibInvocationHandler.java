package com.zpself.module.动态代理.cglib;

import lombok.Data;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zengpeng
 * @date 2019/9/6
 */
@Data
public class CglibInvocationHandler implements MethodInterceptor {

    /**
     * 被代理对象
     */
    private Object target;



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
