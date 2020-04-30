package com.zpself.module.设计模式23.结构型模式.h代理模式;
//静态代理
public class ProxyPatternTest {
   
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
 
      // 图像将从磁盘加载
      image.display(); 
      System.out.println("");
      // 图像不需要从磁盘加载
      image.display();  
   }
}