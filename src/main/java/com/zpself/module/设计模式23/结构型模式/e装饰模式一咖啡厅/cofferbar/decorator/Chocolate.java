package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar.decorator;

import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar.Drink;

public class Chocolate extends Decorator{
    public  Chocolate (Drink obj){
        super(obj);
        setDescription("Chocolate:巧克力");
        setPrice(1);
    }
}
