package com.zpself.module.设计模式23.行为型模式.f观察者模式.observer;

import com.zpself.module.设计模式23.行为型模式.f观察者模式.Subject;

public class OctalObserver extends Observer{
 
   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
     System.out.println( "Octal String: " 
     + Integer.toOctalString( subject.getState() ) ); 
   }
}