package com.zpself.module.设计模式23.行为型模式.f观察者模式.observer;

import com.zpself.module.设计模式23.行为型模式.f观察者模式.Subject;

public class HexaObserver extends Observer{
 
   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}