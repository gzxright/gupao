package 结构型模式.外观模式;

public class 图形制造者 {
    private 图形 circle;
    private 图形 rectangle;
    private 图形 square;

    public 图形制造者() {
        circle = new 圆形();
        rectangle = new 矩形();
        square = new 正方形();
    }

    public void drawCircle(){
        circle.画();
    }
    public void drawRectangle(){
        rectangle.画();
    }
    public void drawSquare(){
        square.画();
    }
}
