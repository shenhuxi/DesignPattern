package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Impl;


import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Interface.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}