package com.zpself.module.设计模式23.创建型模式.c单例模式.饿汉;

public class SingleObject {
 
   //创建 SingleObject 的一个对象
   private static SingleObject instance = new SingleObject();
 
   //让构造函数为 private，这样该类就不会被实例化
   private SingleObject(){}
 
   //获取唯一可用的对象
   public static SingleObject getInstance(){
      return instance;
   }
 
   public static void showMessage(){
      System.out.println("Hello World!");
   }


}