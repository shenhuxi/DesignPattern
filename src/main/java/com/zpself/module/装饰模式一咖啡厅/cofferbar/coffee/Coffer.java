package com.zpself.module.装饰模式一咖啡厅.cofferbar.coffee;

import com.zpself.module.装饰模式一咖啡厅.cofferbar.Drink;

public class Coffer extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
