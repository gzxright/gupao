package J2EE模式.拦截过滤器模式;

public class 请求处理程序 {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
