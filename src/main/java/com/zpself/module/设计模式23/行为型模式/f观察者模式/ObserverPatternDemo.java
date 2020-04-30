package com.zpself.module.设计模式23.行为型模式.f观察者模式;

import com.zpself.module.设计模式23.行为型模式.f观察者模式.observer.BinaryObserver;
import com.zpself.module.设计模式23.行为型模式.f观察者模式.observer.HexaObserver;
import com.zpself.module.设计模式23.行为型模式.f观察者模式.observer.OctalObserver;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();
 
      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
 
      System.out.println("First state change: 15");   
      subject.setState(15);
      System.out.println("Second state change: 10");  
      subject.setState(10);
   }
}