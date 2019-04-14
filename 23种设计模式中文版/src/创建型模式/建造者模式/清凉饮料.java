package 创建型模式.建造者模式;

public abstract class 清凉饮料 implements 套餐 {

    public 包装 包装方式() {
        return new 瓶装();
    }

    @Override
    public abstract float 价格();
}