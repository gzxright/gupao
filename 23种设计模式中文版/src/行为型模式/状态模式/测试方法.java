package 行为型模式.状态模式;


import 行为型模式.观察者模式.主题;
import 行为型模式.观察者模式.二进制观察者;
import 行为型模式.观察者模式.八进制观察者;
import 行为型模式.观察者模式.六进制观察者;

public class 测试方法 {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}