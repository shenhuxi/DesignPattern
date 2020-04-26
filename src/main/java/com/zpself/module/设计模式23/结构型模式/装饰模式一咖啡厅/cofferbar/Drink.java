package com.zpself.module.设计模式23.结构型模式.装饰模式一咖啡厅.cofferbar;

public abstract class Drink {
    public String description = "";
    private  float price;

    public String getDescription() {
        return description+"价格:"+this.price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
