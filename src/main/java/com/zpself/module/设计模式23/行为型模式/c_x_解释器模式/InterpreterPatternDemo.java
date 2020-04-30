package com.zpself.module.设计模式23.行为型模式.c_x_解释器模式;

import com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Impl.AndExpression;
import com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Impl.OrExpression;
import com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Impl.TerminalExpression;
import com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Interface.Expression;

public class InterpreterPatternDemo {
 
   //规则：Robert 和 John 是男性
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);
   }
 
   //规则：Julie 是一个已婚的女性
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
   }
 
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
 
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
   }
}