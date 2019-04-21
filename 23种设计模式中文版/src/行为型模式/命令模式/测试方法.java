package 行为型模式.命令模式;



public class 测试方法 {

    public static void main(String[] args) {
        股票 abcStock = new 股票();

        买股票 buyStockOrder = new 买股票(abcStock);
        卖股票 sellStockOrder = new 卖股票(abcStock);

        经纪人 broker = new 经纪人();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}