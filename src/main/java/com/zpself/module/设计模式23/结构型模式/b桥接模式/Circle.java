package com.zpself.module.设计模式23.结构型模式.b桥接模式;

import com.zpself.module.设计模式23.结构型模式.b桥接模式.Interface.DrawAPI;

public class Circle extends Shape {
   private int x, y, radius;
 
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }
 
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}