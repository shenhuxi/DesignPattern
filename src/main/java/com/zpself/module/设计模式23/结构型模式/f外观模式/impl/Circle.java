package com.zpself.module.设计模式23.结构型模式.f外观模式.impl;


import com.zpself.module.设计模式23.结构型模式.f外观模式.Interface.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}