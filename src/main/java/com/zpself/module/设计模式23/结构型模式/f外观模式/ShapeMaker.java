package com.zpself.module.设计模式23.结构型模式.f外观模式;

import com.zpself.module.设计模式23.结构型模式.f外观模式.Interface.Shape;
import com.zpself.module.设计模式23.结构型模式.f外观模式.impl.Circle;
import com.zpself.module.设计模式23.结构型模式.f外观模式.impl.Rectangle;
import com.zpself.module.设计模式23.结构型模式.f外观模式.impl.Square;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
 
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }
 
   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}