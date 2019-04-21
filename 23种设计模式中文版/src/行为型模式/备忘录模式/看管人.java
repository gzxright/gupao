package 行为型模式.备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class 看管人 {
    private List<备忘录> mementoList = new ArrayList<备忘录>();

    public void add(备忘录 state){
        mementoList.add(state);
    }

    public 备忘录 get(int index){
        return mementoList.get(index);
    }
}
