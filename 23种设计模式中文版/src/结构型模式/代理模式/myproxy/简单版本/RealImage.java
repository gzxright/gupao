package 结构型模式.代理模式.myproxy.简单版本;

public class RealImage implements 图像 {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        从磁盘加载(fileName);
    }

    @Override
    public void 显示() {
        System.out.println("Displaying " + fileName);
    }

    private void 从磁盘加载(String fileName){
        System.out.println("Loading " + fileName);
    }
}