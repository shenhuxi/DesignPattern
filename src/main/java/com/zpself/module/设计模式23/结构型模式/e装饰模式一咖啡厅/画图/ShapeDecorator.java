package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图;

import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Interface.Shape;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
 
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }
 
   public void draw(){
      decoratedShape.draw();
   }  
}