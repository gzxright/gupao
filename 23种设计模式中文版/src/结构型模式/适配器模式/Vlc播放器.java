package 结构型模式.适配器模式;

public class Vlc播放器  implements 先进的媒体播放器{
    @Override
    public void 播放Vlc(String fileName) {
        System.out.println("播放 vlc file. Name: "+ fileName);
    }

    @Override
    public void 播放Mp4(String fileName) {
        //什么也不做
    }


}