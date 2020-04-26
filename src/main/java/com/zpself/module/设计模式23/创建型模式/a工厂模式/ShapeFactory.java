package com.zpself.module.设计模式23.创建型模式.a工厂模式;

import com.zpself.module.设计模式23.创建型模式.a工厂模式.Interface.Shape;
import com.zpself.module.设计模式23.创建型模式.a工厂模式.impl.Circle;
import com.zpself.module.设计模式23.创建型模式.a工厂模式.impl.Rectangle;
import com.zpself.module.设计模式23.创建型模式.a工厂模式.impl.Square;

public class ShapeFactory {
    
   //使用 getShape 方法获取形状类型的对象
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
}