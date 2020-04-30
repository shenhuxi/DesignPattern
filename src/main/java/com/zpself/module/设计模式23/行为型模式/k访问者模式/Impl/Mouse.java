package com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPart;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPartVisitor;
public class Mouse  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}