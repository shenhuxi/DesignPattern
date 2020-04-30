package com.zpself.module.设计模式23.行为型模式.b命令模式.Impl;

import com.zpself.module.设计模式23.行为型模式.b命令模式.Interface.Order;
import com.zpself.module.设计模式23.行为型模式.b命令模式.Stock;

public class SellStock implements Order {
   private Stock abcStock;
 
   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.sell();
   }
}