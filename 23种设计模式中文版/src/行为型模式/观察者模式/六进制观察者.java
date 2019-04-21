package 行为型模式.观察者模式;

public class 六进制观察者 extends 观察者{

    public 六进制观察者(主题 subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex   String: "
                + Integer.toHexString( subject.getState() ) );
    }
}
