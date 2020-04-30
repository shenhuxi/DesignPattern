package com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.Impl;

import com.zpself.module.设计模式23.行为型模式.h_x_空对象模式.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
 
   @Override
   public String getName() {
      return "Not Available in Customer Database";
   }
 
   @Override
   public boolean isNil() {
      return true;
   }
}