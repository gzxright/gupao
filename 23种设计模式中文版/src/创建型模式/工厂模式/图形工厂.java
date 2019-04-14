package 创建型模式.工厂模式;

public class 图形工厂 {

    //使用 getShape 方法获取形状类型的对象
    public 图形 获得图形(String 图形类型){
        if(图形类型 == null){
            return null;
        }
        if(图形类型.equalsIgnoreCase("圆形")){
            return new 圆形();
        } else if(图形类型.equalsIgnoreCase("矩形")){
            return new 矩形();
        } else if(图形类型.equalsIgnoreCase("正方形")){
            return new 正方形();
        }
        return null;
    }
}