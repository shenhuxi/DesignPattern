package com.zpself.module.设计模式23.行为型模式.d中介者模式;

import java.util.Date;
 
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString()
         + " [" + user.getName() +"] : " + message);
   }
}