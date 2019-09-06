package com.zpself.module.动态代理.cglib;

import lombok.Data;
import org.springframework.cglib.proxy.Enhancer;
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

    /**
     * 动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例
     * @param object 被代理对象
     * @return 代理对象
     */
     public Object getProxyObject(Object object) {
        this.target = object;
        //增强器，动态代码生成器
        Enhancer enhancer=new Enhancer();
        //回调方法
         enhancer.setCallback(this);
        //设置生成类的父类类型
         enhancer.setSuperclass(target.getClass());
        //动态生成字节码并返回代理对象
         return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 被织入的横切内容，开始时间 before
        long start = System.currentTimeMillis();
        // 调用方法
        Object result = methodProxy.invoke(target, objects);
        Thread.sleep(10);
        // 被织入的横切内容，结束时间
        System.out.println("共用时：" + (System.currentTimeMillis() - start));
        return result;
    }
}
