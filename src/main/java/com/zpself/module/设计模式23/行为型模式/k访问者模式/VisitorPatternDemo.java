package com.zpself.module.设计模式23.行为型模式.k访问者模式;

import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.Computer;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl.ComputerPartDisplayVisitor;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPart;
public class VisitorPatternDemo {
   public static void main(String[] args) {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}