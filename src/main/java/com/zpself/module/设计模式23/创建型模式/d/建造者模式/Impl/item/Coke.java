package com.zpself.module.设计模式23.创建型模式.d.建造者模式.Impl.item;
//咖啡
public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}