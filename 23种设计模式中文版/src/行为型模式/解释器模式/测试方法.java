package 行为型模式.解释器模式;


import 行为型模式.命令模式.买股票;
import 行为型模式.命令模式.卖股票;
import 行为型模式.命令模式.经纪人;
import 行为型模式.命令模式.股票;

public class 测试方法 {

        //规则：Robert 和 John 是男性
        public static 表达式 getMaleExpression(){
            表达式 robert = new 终端表达式("Robert");
            表达式 john = new 终端表达式("John");
            return new 或表达式(robert, john);
        }

        //规则：Julie 是一个已婚的女性
        public static 表达式 getMarriedWomanExpression(){
            表达式 julie = new 终端表达式("Julie");
            表达式 married = new 终端表达式("Married");
            return new 和表达式(julie, married);
        }

        public static void main(String[] args) {
            表达式 isMale = getMaleExpression();
            表达式 isMarriedWoman = getMarriedWomanExpression();

            System.out.println("John is male? " + isMale.翻译("John"));
            System.out.println("Julie is a married women? "
                    + isMarriedWoman.翻译("Married Julie"));
    }
}