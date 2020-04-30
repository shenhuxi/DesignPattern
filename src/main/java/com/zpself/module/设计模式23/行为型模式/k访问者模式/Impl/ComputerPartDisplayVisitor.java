package com.zpself.module.设计模式23.行为型模式.k访问者模式.Impl;

import com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
 
   @Override
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }
 
   @Override
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }
 
   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }
 
   @Override
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}