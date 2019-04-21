package 结构型模式.代理模式.myproxy.简单版本;

public class 代理方法 implements 图像{

    private RealImage realImage;
    private String fileName;

    public 代理方法(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void 显示() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.显示();
    }
}
