package com.zpself.module.设计模式23.行为型模式.d中介者模式;

public class User {
   private String name;
 
   public String getName() {
      return name;
   }
 
   public void setName(String name) {
      this.name = name;
   }
 
   public User(String name){
      this.name  = name;
   }
 
   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}