package 结构型模式.适配器模式;

public class 音频播放器 implements 媒体播放机 {
    媒体适配器 媒体适配器1;

    @Override
    public void 播放(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //媒体适配器 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            媒体适配器1= new 媒体适配器(audioType);
            媒体适配器1.播放(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
