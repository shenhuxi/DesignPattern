package com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.color;

import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Color;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}