package com.zpself.module.设计模式23.结构型模式.b桥接模式.Impl;

import com.zpself.module.设计模式23.结构型模式.b桥接模式.Interface.DrawAPI;

public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}