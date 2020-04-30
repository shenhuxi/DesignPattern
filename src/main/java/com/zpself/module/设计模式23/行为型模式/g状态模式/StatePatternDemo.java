package com.zpself.module.设计模式23.行为型模式.g状态模式;

import com.zpself.module.设计模式23.行为型模式.g状态模式.Impl.StartState;
import com.zpself.module.设计模式23.行为型模式.g状态模式.Impl.StopState;

public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
 
      StartState startState = new StartState();
      startState.doAction(context);
 
      System.out.println(context.getState().toString());
 
      StopState stopState = new StopState();
      stopState.doAction(context);
 
      System.out.println(context.getState().toString());
   }
}