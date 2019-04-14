package 创建型模式.抽象工厂模式;

public class 图形工厂 extends 抽象工厂 {

    @Override
    public 图形 getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("圆形")) {
            return new 圆形();
        } else if (shapeType.equalsIgnoreCase("矩形")) {
            return new 矩形();
        } else if (shapeType.equalsIgnoreCase("正方形")) {
            return new 正方形();
        }
        return null;
    }

    @Override
    public 颜色 getColor(String color) {
        return null;
    }
}