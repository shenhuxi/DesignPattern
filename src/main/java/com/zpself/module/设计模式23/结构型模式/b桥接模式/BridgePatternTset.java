package com.zpself.module.设计模式23.结构型模式.b桥接模式;

import com.zpself.module.设计模式23.结构型模式.b桥接模式.Impl.GreenCircle;
import com.zpself.module.设计模式23.结构型模式.b桥接模式.Impl.RedCircle;

public class BridgePatternTset {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}