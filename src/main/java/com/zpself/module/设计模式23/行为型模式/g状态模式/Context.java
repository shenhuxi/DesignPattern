package com.zpself.module.设计模式23.行为型模式.g状态模式;

import com.zpself.module.设计模式23.行为型模式.g状态模式.Interface.State;

public class Context {
   private State state;
 
   public Context(){
      state = null;
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}