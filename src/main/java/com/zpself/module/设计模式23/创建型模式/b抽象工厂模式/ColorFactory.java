package com.zpself.module.设计模式23.创建型模式.b抽象工厂模式;

import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.color.Green;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.color.Red;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Color;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Shape;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.impl.color.Blue;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}