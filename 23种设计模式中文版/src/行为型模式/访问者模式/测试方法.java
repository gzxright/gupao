package 行为型模式.访问者模式;


import 行为型模式.责任链模式.AbstractLogger;
import 行为型模式.责任链模式.ConsoleLogger;
import 行为型模式.责任链模式.ErrorLogger;
import 行为型模式.责任链模式.FileLogger;

public class 测试方法 {



    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}