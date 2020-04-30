package com.zpself.module.设计模式23.结构型模式.b桥接模式;

import com.zpself.module.设计模式23.结构型模式.b桥接模式.Interface.DrawAPI;

public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();  
}