package 结构型模式.适配器模式;

public class 媒体适配器 implements 媒体播放机 {

    先进的媒体播放器 先进的媒体播放器1;

    public 媒体适配器(String 音频类型){
        if(音频类型.equalsIgnoreCase("vlc") ){
            先进的媒体播放器1 = new Vlc播放器();
        } else if (音频类型.equalsIgnoreCase("mp4")){
            先进的媒体播放器1 = new Mp4播放器();
        }
    }

    @Override
    public void 播放(String 音频类型, String 文件名) {
        if(音频类型.equalsIgnoreCase("vlc")){
            先进的媒体播放器1.播放Vlc(文件名);
        }else if(音频类型.equalsIgnoreCase("mp4")){
            先进的媒体播放器1.播放Mp4(文件名);
        }
    }
}
