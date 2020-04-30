package com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.advancedMedia;

import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Interface.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}