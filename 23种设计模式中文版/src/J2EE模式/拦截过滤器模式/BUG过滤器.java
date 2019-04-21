package J2EE模式.拦截过滤器模式;

public class BUG过滤器 implements 过滤器 {
    public void execute(String request){
        System.out.println("BUG过滤器 request log: " + request);
    }
}
