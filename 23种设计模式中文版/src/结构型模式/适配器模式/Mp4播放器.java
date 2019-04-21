package 结构型模式.适配器模式;

public class Mp4播放器 implements 先进的媒体播放器{
    @Override
    public void 播放Vlc(String fileName) {
        //什么也不做
    }

    @Override
    public void 播放Mp4(String fileName) {

        System.out.println("播放 mp4( file. Name: "+ fileName);
    }

   
}