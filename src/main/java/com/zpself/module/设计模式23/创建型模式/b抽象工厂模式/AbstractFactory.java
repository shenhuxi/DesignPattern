package com.zpself.module.设计模式23.创建型模式.b抽象工厂模式;

import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Color;
import com.zpself.module.设计模式23.创建型模式.b抽象工厂模式.Interface.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}