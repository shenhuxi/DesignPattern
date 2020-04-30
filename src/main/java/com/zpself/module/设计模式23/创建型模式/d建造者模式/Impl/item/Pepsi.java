package com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item;
//百事可乐
public class Pepsi extends ColdDrink {
 
   @Override
   public float price() {
      return 35.0f;
   }
 
   @Override
   public String name() {
      return "Pepsi";
   }
}