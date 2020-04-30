package com.zpself.module.设计模式23.行为型模式.j模板模式;

import com.zpself.module.设计模式23.行为型模式.j模板模式.Abstract.Game;
import com.zpself.module.设计模式23.行为型模式.j模板模式.impl.Cricket;
import com.zpself.module.设计模式23.行为型模式.j模板模式.impl.Football;

public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
   }
}