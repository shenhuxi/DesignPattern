package com.zpself.module.设计模式23.行为型模式.b命令模式;

import com.zpself.module.设计模式23.行为型模式.b命令模式.Interface.Order;

import java.util.ArrayList;
import java.util.List;
 
public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 
 
   public void takeOrder(Order order){
      orderList.add(order);      
   }
 
   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}