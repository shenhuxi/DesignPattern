package com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.Impl;

import com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
 
   public RealCustomer(String name) {
      this.name = name;    
   }
   
   @Override
   public String getName() {
      return name;
   }
   
   @Override
   public boolean isNil() {
      return false;
   }
}