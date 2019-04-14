package 创建型模式.建造者模式;

public abstract class 汉堡包 implements 套餐 {

    public 包装 包装方式() {
        return new 袋装();
    }

    @Override
    public abstract float 价格();
}