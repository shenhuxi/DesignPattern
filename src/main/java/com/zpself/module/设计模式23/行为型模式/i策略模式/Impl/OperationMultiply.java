package com.zpself.module.设计模式23.行为型模式.i策略模式.Impl;

import com.zpself.module.设计模式23.行为型模式.i策略模式.Interface.Strategy;

public class OperationMultiply implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}