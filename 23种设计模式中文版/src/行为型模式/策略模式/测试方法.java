package 行为型模式.策略模式;


import 行为型模式.观察者模式.主题;
import 行为型模式.观察者模式.二进制观察者;
import 行为型模式.观察者模式.八进制观察者;
import 行为型模式.观察者模式.六进制观察者;

public class 测试方法 {


        public static void main(String[] args) {
            Context context = new Context(new OperationAdd());
            System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

            context = new Context(new OperationSubstract());
            System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

            context = new Context(new OperationMultiply());
            System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        }
}