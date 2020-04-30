package com.zpself.module.设计模式23.行为型模式.g状态模式.Impl;

import com.zpself.module.设计模式23.行为型模式.g状态模式.Context;
import com.zpself.module.设计模式23.行为型模式.g状态模式.Interface.State;

public class StopState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}