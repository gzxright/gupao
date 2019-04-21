package 结构型模式.装饰器;

public class 测试方法 {

    public static void main(String[] args) {

        形状接口 circle = new 圆形();

        形状接口 redCircle = new 红色形状装饰者(new 圆形());

        形状接口 redRectangle = new 红色形状装饰者(new 矩形());
        System.out.println("Circle with normal border");
        circle.画();

        System.out.println("\nCircle of red border");
        redCircle.画();

        System.out.println("\nRectangle of red border");
        redRectangle.画();
    }
}
