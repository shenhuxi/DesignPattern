package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.decorator;

import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Interface.Shape;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
 
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);     
   }
 
   @Override
   public void draw() {
      decoratedShape.draw();         
      setRedBorder(decoratedShape);
   }
 
   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}