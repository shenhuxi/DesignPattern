package com.zpself.module.设计模式23.结构型模式.a适配器模式一.New;

import com.zpself.module.设计模式23.结构型模式.a适配器模式一.New.Impl.media.AudioPlayer;

public class AdapterPatternTest {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}