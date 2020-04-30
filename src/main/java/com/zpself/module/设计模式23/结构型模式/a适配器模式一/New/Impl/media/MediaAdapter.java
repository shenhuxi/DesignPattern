package com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.media;

import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.advancedMedia.Mp4Player;
import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.advancedMedia.VlcPlayer;
import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Interface.AdvancedMediaPlayer;
import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Interface.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;
 
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}