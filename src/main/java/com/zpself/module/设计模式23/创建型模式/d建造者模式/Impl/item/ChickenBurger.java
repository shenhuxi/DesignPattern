package com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item;
//鸡肉汉堡
public class ChickenBurger extends Burger {
 
   @Override
   public float price() {
      return 50.5f;
   }
 
   @Override
   public String name() {
      return "Chicken Burger";
   }
}