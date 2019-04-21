package 结构型模式.桥接模式;

public class 红色的圆 implements 画API {
    @Override
    public void 画圆(int 半径, int x, int y) {
        System.out.println("Drawing Circle[ color: red, 半径: "
                + 半径 +", x: " +x+", "+ y +"]");
    }
}