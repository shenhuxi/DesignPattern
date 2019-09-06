package com.zpself.module.动态代理.cglib;

import com.zpself.module.动态代理.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zengpeng
 * @date 2019/9/6
 */
public class Cglib_Test {

    @Test
    public void testCglib(){
        //写法1、生成代理类字节码
        //增强器，动态代码生成器
        Enhancer enhancer=new Enhancer();
        //回调方法
        enhancer.setCallback(new MethodInterceptor(){
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // 被织入的横切内容，开始时间 before
                long start = System.currentTimeMillis();
                // 调用方法
                Object result = methodProxy.invoke(new UserServiceImpl(), objects);
                Thread.sleep(11);
                // 被织入的横切内容，结束时间
                System.out.println("共用时：" + (System.currentTimeMillis() - start));
                return result;
            }
        });
        //设置生成类的父类类型
        enhancer.setSuperclass(UserServiceImpl.class);
        //动态生成字节码并返回代理对象
        UserServiceImpl userServiceChildren = (UserServiceImpl)enhancer.create();
        userServiceChildren.getUserByName("上路了");

        //写法2、自定义代理生成类
        CglibInvocationHandler cglib = new CglibInvocationHandler();
        UserServiceImpl proxyObject = (UserServiceImpl)cglib.getProxyObject(new UserServiceImpl());
        proxyObject.getUserByName("还是有点懵逼...");
    }
}
