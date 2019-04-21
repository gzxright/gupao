package 结构型模式.适配器模式;

import 创建型模式.建造者模式.进餐;

public class 测试方法 {

    public static void main(String[] args) {
        音频播放器 audioPlayer = new 音频播放器();

        audioPlayer.播放("mp3", "beyond the horizon.mp3");
        audioPlayer.播放("mp4", "alone.mp4");
        audioPlayer.播放("vlc", "far far away.vlc");
        audioPlayer.播放("avi", "mind me.avi");
    }
}