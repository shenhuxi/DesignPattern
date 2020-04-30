package com.zpself.module.设计模式23.行为型模式.e备忘录模式;

public class Memento {
   private String state;
 
   public Memento(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }  
}