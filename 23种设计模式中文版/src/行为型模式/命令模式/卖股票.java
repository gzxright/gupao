package 行为型模式.命令模式;

public class 卖股票 implements Order{
    private 股票 gaoStock;

    public 卖股票(股票 gaoStock){
        this.gaoStock = gaoStock;
    }

    public void execute() {
        gaoStock.buy();
    }
}
