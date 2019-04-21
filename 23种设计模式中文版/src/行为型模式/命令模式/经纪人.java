package 行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

    public class 经纪人 {
        private List<Order> orderList = new ArrayList<Order>();

        public void takeOrder(Order order){
            orderList.add(order);
        }

        public void placeOrders(){
            for (Order order : orderList) {
                order.execute();
            }
            orderList.clear();
        }
    }
