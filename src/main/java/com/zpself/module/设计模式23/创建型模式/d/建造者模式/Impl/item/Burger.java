package com.zpself.module.设计模式23.创建型模式.d.建造者模式.Impl.item;

import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Impl.pack.Wrapper;
import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Interface.Item;
import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Interface.Packing;
//汉堡
public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
}