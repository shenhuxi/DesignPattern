package com.zpself.module.设计模式23.创建型模式.c单例模式;

import com.zpself.module.设计模式23.创建型模式.c单例模式.饿汉.SingleObject;
import com.zpself.module.设计模式23.创建型模式.c单例模式.饿汉.Singleton;

public class SingletonPatternTest {
   public static void main(String[] args) {
 
      //不合法的构造函数
      //编译时错误：构造函数 SingleObject() 是不可见的
      //SingleObject object = new SingleObject();
 
      //获取唯一可用的对象
      SingleObject object = SingleObject.getInstance();
      //枚举形式
      Singleton.INSTANCE.whateverMethod();

 
      //显示消息
      object.showMessage();
   }
}