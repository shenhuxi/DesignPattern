package com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Impl;
import com.zpself.module.设计模式23.行为型模式.c_x_解释器模式.Interface.Expression;
public class TerminalExpression implements Expression {
   
   private String data;
 
   public TerminalExpression(String data){
      this.data = data; 
   }
 
   @Override
   public boolean interpret(String context) {
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}