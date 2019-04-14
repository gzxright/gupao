package 创建型模式.抽象工厂模式;

public class 颜色工厂 extends 抽象工厂 {

    @Override
    public 图形 getShape(String shapeType){
        return null;
    }

    @Override
    public 颜色 getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("红色")){
            return new 红色();
        } else if(color.equalsIgnoreCase("绿色")){
            return new 绿色();
        } else if(color.equalsIgnoreCase("蓝色")){
            return new 蓝色();
        }
        return null;
    }
}