package 行为型模式.备忘录模式;


import 行为型模式.解释器模式.和表达式;
import 行为型模式.解释器模式.或表达式;
import 行为型模式.解释器模式.终端表达式;
import 行为型模式.解释器模式.表达式;

public class 测试方法 {

     

        public static void main(String[] args) {
            发起人 originator = new 发起人();
            看管人 careTaker = new 看管人();
            originator.setState("State #1");
            originator.setState("State #2");
            careTaker.add(originator.saveStateToMemento());
            originator.setState("State #3");
            careTaker.add(originator.saveStateToMemento());
            originator.setState("State #4");

            System.out.println("Current State: " + originator.getState());
            originator.getStateFromMemento(careTaker.get(0));
            System.out.println("First saved State: " + originator.getState());
            originator.getStateFromMemento(careTaker.get(1));
            System.out.println("Second saved State: " + originator.getState());
        }
}