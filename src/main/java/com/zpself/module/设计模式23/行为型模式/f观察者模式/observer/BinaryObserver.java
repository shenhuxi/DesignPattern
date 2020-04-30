package com.zpself.module.设计模式23.行为型模式.f观察者模式.observer;

import com.zpself.module.设计模式23.行为型模式.f观察者模式.Subject;

public class BinaryObserver extends Observer{
 
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString( subject.getState() ) ); 
   }
}