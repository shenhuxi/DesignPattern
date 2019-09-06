package com.zpself.module.动态代理.proxy;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zengpeng
 * @date 2019/9/6
 */
@Data
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    /**
     * 构造方法
     * @param target 被代理对象
     */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
        //在执行目标方法前----------
        System.out.println("before");
        Object invoke = method.invoke(target, args);
        System.out.println("end");
        return invoke;
    }

    public  Object getProxy(){
        return  Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(),this);
    }

}
