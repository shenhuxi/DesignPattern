package com.zpself.module.设计模式23.创建型模式.a工厂模式.impl;

import com.zpself.module.设计模式23.创建型模式.a工厂模式.Interface.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}