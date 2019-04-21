package 行为型模式.解释器模式;

public class 或表达式 implements 表达式 {

    private 表达式 expr1 = null;
    private 表达式 expr2 = null;

    public 或表达式(表达式 expr1, 表达式 expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean 翻译(String context) {
        return expr1.翻译(context) && expr2.翻译(context);
    }
}