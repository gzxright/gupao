package strategy;

public class Context {
    private Unfiltereder unfiltereder;


    //使用构造方法实现不同功能
    public Context(Unfiltereder unfiltereder){
        this.unfiltereder = unfiltereder;
    }

    public String executeUnfiltered(String  str){
        return unfiltereder.unfiltered(str);
    }
}