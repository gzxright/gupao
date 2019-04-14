package 创建型模式.建造者模式;
import java.util.ArrayList;
import java.util.List;
public class 进餐 {
    private List<套餐> items = new ArrayList<套餐>();

    public void 点餐(套餐 套餐){
        items.add(套餐);
    }

    public float 消费(){
        float cost = 0.0f;
        for (套餐 套餐 : items) {
            cost += 套餐.价格();
        }
        return cost;
    }

    public void 显示已点套餐(){
        for (套餐 套餐 : items) {
            System.out.print("套餐 : "+套餐.name());
            System.out.print(", Packing : "+套餐.包装方式().包装方式());
            System.out.println(", Price : "+套餐.价格());
        }
    }
}
