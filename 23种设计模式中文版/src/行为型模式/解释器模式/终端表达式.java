package 行为型模式.解释器模式;

public class 终端表达式 implements 表达式 {

    private String data;

   public 终端表达式(String data){
        this.data = data;
    }

    @Override
    public boolean 翻译(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}