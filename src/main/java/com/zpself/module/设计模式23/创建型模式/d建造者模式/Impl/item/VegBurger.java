package com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item;
//蔬菜汉堡
public class VegBurger extends Burger {
 
   @Override
   public float price() {
      return 25.0f;
   }
 
   @Override
   public String name() {
      return "Veg Burger";
   }
}