package com.zpself.module.设计模式23.创建型模式.d建造者模式;

import com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item.ChickenBurger;
import com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item.Coke;
import com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item.Pepsi;
import com.zpself.module.设计模式23.创建型模式.d建造者模式.Impl.item.VegBurger;

public class MealBuilder {

   //构建蔬菜 套餐
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   //构建没蔬菜 套餐
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}