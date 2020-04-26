package com.zpself.module.设计模式23.创建型模式.b抽象工厂模式;

import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Color;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Shape;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.shape.Circle;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.shape.Rectangle;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.shape.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}