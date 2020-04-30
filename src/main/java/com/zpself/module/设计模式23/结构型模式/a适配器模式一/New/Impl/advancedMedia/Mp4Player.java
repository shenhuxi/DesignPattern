package com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.advancedMedia;

import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Interface.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
 
   @Override
   public void playVlc(String fileName) {
      //什么也不做
   }
 
   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);      
   }
}