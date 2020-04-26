package com.zpself.module.设计模式23.创建型模式.e原型模式.impl;

import com.zpself.module.设计模式23.创建型模式.e原型模式.Interface.Shape;

public class Circle extends Shape {
 
   public Circle(){
     type = "Circle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }

    @Override
    public Object clone() {
        return super.clone();
    }
}