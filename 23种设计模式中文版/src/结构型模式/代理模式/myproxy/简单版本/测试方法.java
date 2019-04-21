package 结构型模式.代理模式.myproxy.简单版本;

import 结构型模式.外观模式.图形制造者;

public class 测试方法 {

    public static void main(String[] args) {
        图像 image = new 代理方法("test_10mb.jpg");

        // 图像将从磁盘加载
        image.显示();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.显示();
    }
}
