package 行为型模式.空对象模式;


import 行为型模式.观察者模式.主题;
import 行为型模式.观察者模式.二进制观察者;
import 行为型模式.观察者模式.八进制观察者;
import 行为型模式.观察者模式.六进制观察者;

public class 测试方法 {


        public static void main(String[] args) {
            AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
            AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
            AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
            AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

            System.out.println("Customers");
            System.out.println(customer1.getName());
            System.out.println(customer2.getName());
            System.out.println(customer3.getName());
            System.out.println(customer4.getName());
        }
}