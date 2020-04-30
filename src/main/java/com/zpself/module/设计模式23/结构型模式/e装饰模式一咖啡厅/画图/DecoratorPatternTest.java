package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图;

import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Impl.Circle;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Impl.Rectangle;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.Interface.Shape;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.画图.decorator.RedShapeDecorator;

public class DecoratorPatternTest {
   public static void main(String[] args) {
 
      Shape circle = new Circle();
      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());

      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
      //Shape redCircle = new RedShapeDecorator(new Circle());
      //Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
 
      System.out.println("\nCircle of red border");
      redCircle.draw();
 
      System.out.println("\nRectangle of red border");
      redRectangle.draw();

      redRectangle.decoratedShape = new Circle();
      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}