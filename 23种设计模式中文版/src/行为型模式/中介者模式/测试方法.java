package 行为型模式.中介者模式;


import 行为型模式.命令模式.买股票;
import 行为型模式.命令模式.卖股票;
import 行为型模式.命令模式.经纪人;
import 行为型模式.命令模式.股票;

public class 测试方法 {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}