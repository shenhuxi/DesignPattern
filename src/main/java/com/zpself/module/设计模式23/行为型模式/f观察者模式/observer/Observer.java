package com.zpself.module.设计模式23.行为型模式.f观察者模式.observer;

import com.zpself.module.设计模式23.行为型模式.f观察者模式.Subject;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}