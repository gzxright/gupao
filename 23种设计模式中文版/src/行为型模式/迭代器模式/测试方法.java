package 行为型模式.迭代器模式;


import 行为型模式.责任链模式.AbstractLogger;
import 行为型模式.责任链模式.ConsoleLogger;
import 行为型模式.责任链模式.ErrorLogger;
import 行为型模式.责任链模式.FileLogger;

public class 测试方法 {

        public static void main(String[] args) {
            NameRepository namesRepository = new NameRepository();

            for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
                String name = (String) iter.next();
                System.out.println("Name : " + name);
            }
        }
}