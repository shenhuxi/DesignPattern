package com.zpself.module.设计模式23.行为型模式.j模板模式.impl;

import com.zpself.module.设计模式23.行为型模式.j模板模式.Abstract.Game;

public class Cricket extends Game {
 
   @Override
   public void endPlay() {
      System.out.println("Cricket Game Finished!");
   }
 
   @Override
   public void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }
 
   @Override
   public void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}