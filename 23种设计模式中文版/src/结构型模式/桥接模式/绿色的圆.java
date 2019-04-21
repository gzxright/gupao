package 结构型模式.桥接模式;

public class 绿色的圆 implements 画API {
    @Override
    public void 画圆(int 半径, int x, int y) {
        System.out.println("Drawing Circle[ color: 绿, 半径: "
                + 半径 +", x: " +x+", "+ y +"]");
    }
}