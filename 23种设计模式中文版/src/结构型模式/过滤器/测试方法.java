package 结构型模式.过滤器;

import 结构型模式.适配器模式.音频播放器;

import java.util.ArrayList;
import java.util.List;

public class 测试方法 {

    public static void main(String[] args) {
        List<人> persons = new ArrayList<人>();

        persons.add(new 人("Robert","男", "单身"));
        persons.add(new 人("John","男", "已婚"));
        persons.add(new 人("Laura","女", "已婚"));
        persons.add(new 人("Diana","女", "单身"));
        persons.add(new 人("Mike","男", "单身"));
        persons.add(new 人("Bobby","男", "单身"));

        标准 male = new 标准男性();
        标准 female = new 标准女性();
        标准 single = new 标准单身();
        标准 singleMale = new 与标准(single, male);
        标准 singleOrFemale = new 或标准(single, female);

        System.out.println("Males: ");
        printPersons(male.满足标准(persons));

        System.out.println("\nFemales: ");
        printPersons(female.满足标准(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.满足标准(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.满足标准(persons));
    }

    public static void printPersons(List<人> persons){
        for (人 人 : persons) {
            System.out.println("人 : [ Name : " + 人.getName()
                    +", Gender : " + 人.get性别()
                    +", Marital Status : " + 人.get婚姻状态()
                    +" ]");
        }
    }
}