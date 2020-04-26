package com.zpself.module.设计模式23.结构型模式.装饰模式一咖啡厅.cofferbar.decorator;

import com.zpself.module.设计模式23.结构型模式.装饰模式一咖啡厅.cofferbar.Drink;

public class Decorator extends Drink {//装饰者
    private Drink obj;

    public  Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription() {
        return description+"价格:"+this.getPrice() +"&&"+obj.getDescription();
    }
}
