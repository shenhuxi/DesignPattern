package com.zpself.module.动态代理.proxy;

import com.zpself.module.动态代理.entity.User;
import com.zpself.module.动态代理.service.UserService;
import com.zpself.module.动态代理.service.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zengpeng
 * @date 2019/9/6
 */
public class Porxy_Test {
    public static void main(String[] args) {
        // 实例化目标对象
        UserService userService = new UserServiceImpl();

        //方法1：生成匿名内部类
        UserService proxy2 = (UserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(), new Class[]{UserService.class},
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //在执行目标方法前----------
                        System.out.println("before");
                        Object invoke = method.invoke(userService, args);
                        System.out.println("end");
                        return invoke;
                    }
                });



        //方法二：自定义代理生成器，封装一下代码
        // 实例化InvocationHandler
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        // 根据目标对象生成代理对象
        UserService proxy1 = (UserService)myInvocationHandler.getProxy();

        // 调用代理对象的方法
        User userByName = proxy1.getUserByName("一脸懵逼.....");
        System.out.println("执行完代理的对象："+userByName);
    }


    @Test
    public void getProxyClassFile(){
        ProxyGeneratorUtils.writeProxyClassToHardDisk("C:\\Users\\cn\\Desktop\\gc/$Proxy11.class");
    }

}
