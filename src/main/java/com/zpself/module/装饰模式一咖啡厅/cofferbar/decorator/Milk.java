package com.zpself.module.装饰模式一咖啡厅.cofferbar.decorator;

import com.zpself.module.装饰模式一咖啡厅.cofferbar.Drink;

public class Milk extends Decorator{
    public Milk(Drink obj){
        super(obj);
        setDescription("Milk:牛奶");
        setPrice(2);
    }
}
