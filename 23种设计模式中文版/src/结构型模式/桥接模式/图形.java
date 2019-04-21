package 结构型模式.桥接模式;

public abstract class 图形 {
    protected 画API drawAPI;
    protected 图形(画API drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}