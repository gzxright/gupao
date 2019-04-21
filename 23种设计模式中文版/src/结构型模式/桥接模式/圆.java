package 结构型模式.桥接模式;

public class 圆 extends 图形 {
    private int x, y, radius;

    public 圆(int x, int y, int radius, 画API drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.画圆(radius,x,y);
    }
}