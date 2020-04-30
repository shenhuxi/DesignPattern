package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar;

import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar.coffee.Espresso;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar.decorator.Milk;
import com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.cofferbar.decorator.soy;

public class Cofferbar {
    public static void main(String[] args) {
        Drink consumer= new soy(new Milk(new Espresso()));
        System.out.println(consumer.cost());
        System.out.println(consumer.getDescription());
    }
}
