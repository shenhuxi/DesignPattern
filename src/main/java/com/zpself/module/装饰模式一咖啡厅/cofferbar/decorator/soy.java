package com.zpself.module.装饰模式一咖啡厅.cofferbar.decorator;

import com.zpself.module.装饰模式一咖啡厅.cofferbar.Drink;

public class soy extends Decorator{
    public soy(Drink obj){
        super(obj);
        setDescription("soy:大豆");
        setPrice(3);
    }
}
