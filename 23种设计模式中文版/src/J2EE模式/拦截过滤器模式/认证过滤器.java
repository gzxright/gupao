package J2EE模式.拦截过滤器模式;

public class  认证过滤器 implements 过滤器 {
    public void execute(String request){
        System.out.println("认证过滤器 Authenticating request: " + request);
    }
}
