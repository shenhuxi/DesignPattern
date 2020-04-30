package com.zpself.module.设计模式23.行为型模式.j模板模式.Abstract;

public abstract class Game {
   public abstract void initialize();
   public abstract void startPlay();
   public abstract void endPlay();
 
   //模板
   public final void play(){
 
      //初始化游戏
      initialize();
 
      //开始游戏
      startPlay();
 
      //结束游戏
      endPlay();
   }
}