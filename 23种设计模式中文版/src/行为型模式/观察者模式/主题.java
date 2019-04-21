package 行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class 主题 {
    private List<观察者> observers
            = new ArrayList<观察者>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(观察者 observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (观察者 observer : observers) {
            observer.update();
        }
    }
}
