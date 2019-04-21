package 行为型模式.备忘录模式;

public class 备忘录 {
    private String state;

    public 备忘录(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
