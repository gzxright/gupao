package 行为型模式.模板模式;


import 行为型模式.状态模式.Context;
import 行为型模式.状态模式.StartState;
import 行为型模式.状态模式.StopState;

public class 测试方法 {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}