package 结构型模式.享元模式;

import java.util.HashMap;

public class 图形工厂 {
    private static final HashMap<String, 图形> circleMap = new HashMap<>();

    public static 图形 getCircle(String color) {
        圆 circle = (圆)circleMap.get(color);

        if(circle == null) {
            circle = new 圆(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
