package 结构型模式.外观模式;

import 结构型模式.桥接模式.图形;
import 结构型模式.桥接模式.圆;
import 结构型模式.桥接模式.红色的圆;
import 结构型模式.桥接模式.绿色的圆;

public class 测试方法 {

    public static void main(String[] args) {

        图形制造者 shapeMaker = new 图形制造者();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
