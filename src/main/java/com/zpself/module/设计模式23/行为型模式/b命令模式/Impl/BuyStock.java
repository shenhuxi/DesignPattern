package com.zpself.module.设计模式23.行为型模式.b命令模式.Impl;

import com.zpself.module.设计模式23.行为型模式.b命令模式.Interface.Order;
import com.zpself.module.设计模式23.行为型模式.b命令模式.Stock;

public class BuyStock implements Order {
   private Stock abcStock;
 
   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.buy();
   }
}