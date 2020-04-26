package com.zpself.module.设计模式23.创建型模式.e原型模式.impl;

import com.zpself.module.设计模式23.创建型模式.e原型模式.Interface.Shape;

public class Rectangle extends Shape {
 
   public Rectangle(){
     type = "Rectangle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}