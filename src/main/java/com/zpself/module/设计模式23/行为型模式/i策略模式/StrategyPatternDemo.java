package com.zpself.module.设计模式23.行为型模式.i策略模式;

import com.zpself.module.设计模式23.行为型模式.i策略模式.Impl.OperationAdd;
import com.zpself.module.设计模式23.行为型模式.i策略模式.Impl.OperationMultiply;
import com.zpself.module.设计模式23.行为型模式.i策略模式.Impl.OperationSubtract;

public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationSubtract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}