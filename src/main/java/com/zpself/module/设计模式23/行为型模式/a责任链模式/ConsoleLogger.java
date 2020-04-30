package com.zpself.module.设计模式23.行为型模式.a责任链模式;

public class ConsoleLogger extends AbstractLogger {
 
   public ConsoleLogger(int level){
      this.level = level;
   }
 
   @Override
   protected void write(String message) {    
      System.out.println("Standard Console::Logger: " + message);
   }
}