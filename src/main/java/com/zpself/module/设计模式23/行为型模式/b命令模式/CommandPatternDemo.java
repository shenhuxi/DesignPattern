package com.zpself.module.设计模式23.行为型模式.b命令模式;

import com.zpself.module.设计模式23.行为型模式.b命令模式.Impl.BuyStock;
import com.zpself.module.设计模式23.行为型模式.b命令模式.Impl.SellStock;

public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();
 
      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);
 
      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);
 
      broker.placeOrders();
   }
}