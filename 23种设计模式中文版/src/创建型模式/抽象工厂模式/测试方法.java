package 创建型模式.抽象工厂模式;

public class 测试方法 {

    public static void main(String[] args) {

        //获取形状工厂
        抽象工厂 shapeFactory = 工厂创造器.getFactory("图形");

        //获取形状为 圆形 的对象
        图形 shape1 = shapeFactory.getShape("圆形");

        //调用 圆形 的 画 方法
        shape1.画();

        //获取形状为 Rectangle 的对象
        图形 shape2 = shapeFactory.getShape("矩形");

        //调用 Rectangle 的 画 方法
        shape2.画();

        //获取形状为 Square 的对象
        图形 shape3 = shapeFactory.getShape("正方形");

        //调用 Square 的 画 方法
        shape3.画();

        //获取颜色工厂
        抽象工厂 colorFactory = 工厂创造器.getFactory("颜色");

        //获取颜色为 Red 的对象
        颜色 color1 = colorFactory.getColor("红色");

        //调用 Red 的 填充 方法
        color1.填充();

        //获取颜色为 Green 的对象
        颜色 color2 = colorFactory.getColor("绿色");

        //调用 Green 的 填充 方法
        color2.填充();

        //获取颜色为 Blue 的对象
        颜色 color3 = colorFactory.getColor("蓝色");

        //调用 Blue 的 填充 方法
        color3.填充();
    }
}