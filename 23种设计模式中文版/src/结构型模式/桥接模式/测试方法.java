package 结构型模式.桥接模式;

import 结构型模式.装饰器.圆形;
import 结构型模式.装饰器.形状接口;
import 结构型模式.装饰器.矩形;
import 结构型模式.装饰器.红色形状装饰者;

public class 测试方法 {

    public static void main(String[] args) {

        图形 redCircle = new 圆(100,100, 10, new 红色的圆());
        图形 greenCircle = new 圆(100,100, 10, new 绿色的圆());

        redCircle.draw();
        greenCircle.draw();
    }
}
