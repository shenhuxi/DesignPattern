package com.zpself.module.设计模式23.行为型模式.k访问者模式.Interface;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}