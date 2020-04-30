package com.zpself.module.设计模式23.行为型模式.h_x_空对象模式;

import com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.Impl.NullCustomer;
import com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.Impl.RealCustomer;

public class CustomerFactory {
   
   public static final String[] names = {"Rob", "Joe", "Julie"};
 
   public static AbstractCustomer getCustomer(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}