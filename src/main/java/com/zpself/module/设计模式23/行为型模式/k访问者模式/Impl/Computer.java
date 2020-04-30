package com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl;

import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPart;
import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPartVisitor;

public class Computer implements ComputerPart {
   
   ComputerPart[] parts;
 
   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
   } 
 
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}