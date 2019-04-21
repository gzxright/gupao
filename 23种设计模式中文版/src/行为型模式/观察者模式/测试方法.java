package 行为型模式.观察者模式;


import 行为型模式.解释器模式.和表达式;
import 行为型模式.解释器模式.或表达式;
import 行为型模式.解释器模式.终端表达式;
import 行为型模式.解释器模式.表达式;

public class 测试方法 {


        public static void main(String[] args) {
            主题 subject = new 主题();

            new 六进制观察者(subject);
            new 八进制观察者(subject);
            new 二进制观察者(subject);

            System.out.println("First state change: 15");
            subject.setState(15);
            System.out.println("Second state change: 10");
            subject.setState(10);

        }
}