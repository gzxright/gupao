package 创建型模式.建造者模式;

public class 进餐建造者 {

    public 进餐 准备吃素的 (){
        进餐 进餐 = new 进餐();
        进餐.点餐(new 蔬菜汉堡包());
        进餐.点餐(new 可乐());
        return 进餐;
    }

    public 进餐 准备吃肉的 (){
        进餐 进餐 = new 进餐();
        进餐.点餐(new 鸡肉汉堡包());
        进餐.点餐(new 橙汁());
        return 进餐;
    }

}
