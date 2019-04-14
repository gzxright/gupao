package 创建型模式.工厂模式;

public class 测试方法 {

    public static void main(String[] args) {
        图形工厂 图形工厂1 = new 图形工厂();

        //获取 Circle 的对象，并调用它的 画 方法
        图形 图形1 = 图形工厂1.获得图形("圆形");

        //调用 Circle 的 画 方法
        图形1.画();

        //获取 Rectangle 的对象，并调用它的 画 方法
        图形 图形2 = 图形工厂1.获得图形("矩形");

        //调用 Rectangle 的 画 方法
        图形2.画();

        //获取 Square 的对象，并调用它的 画 方法
        图形 图形3 = 图形工厂1.获得图形("正方形");

        //调用 Square 的 画 方法
        图形3.画();
    }
}