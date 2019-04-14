package 创建型模式.抽象工厂模式;

public class 工厂创造器 {

    public static 抽象工厂 getFactory(String choice){
        if(choice.equalsIgnoreCase("图形")){
            return new 图形工厂();
        } else if(choice.equalsIgnoreCase("颜色")){
            return new 颜色工厂();
        }
        return null;
    }

}
