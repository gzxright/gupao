package 创建型模式.建造者模式;

import 创建型模式.工厂模式.图形;
import 创建型模式.工厂模式.图形工厂;

public class 测试方法 {

    public static void main(String[] args) {
        进餐建造者 进餐建造者1 = new 进餐建造者();

        进餐 vegMeal = 进餐建造者1.准备吃素的();
        System.out.println("素套餐");
        vegMeal.显示已点套餐();
        System.out.println("总消费: " +vegMeal.消费());

        进餐 nonVegMeal = 进餐建造者1.准备吃肉的();
        System.out.println("\n\n肉套餐");
        nonVegMeal.显示已点套餐();
        System.out.println("总消费: " +nonVegMeal.消费());
    }
}