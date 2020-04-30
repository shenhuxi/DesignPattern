package com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface;

import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.Computer;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.Keyboard;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.Monitor;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.Mouse;

public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}