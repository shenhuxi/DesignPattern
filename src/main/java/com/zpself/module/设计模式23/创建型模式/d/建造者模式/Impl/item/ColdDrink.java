package com.zpself.module.设计模式23.创建型模式.d.建造者模式.Impl.item;

import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Impl.pack.Bottle;
import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Interface.Item;
import com.zpself.module.设计模式23.创建型模式.d.建造者模式.Interface.Packing;
//冷饮
public abstract class ColdDrink implements Item {
 
    @Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}