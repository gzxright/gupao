package 创建型模式.建造者模式;

public  class 蔬菜汉堡包 extends  汉堡包 {

    @Override
    public float 价格() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜 汉堡包";
    }
}