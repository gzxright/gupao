package 行为型模式.备忘录模式;

public class 发起人 {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public 备忘录 saveStateToMemento(){
        return new 备忘录(state);
    }

    public void getStateFromMemento(备忘录 Memento){
        state = Memento.getState();
    }

}
