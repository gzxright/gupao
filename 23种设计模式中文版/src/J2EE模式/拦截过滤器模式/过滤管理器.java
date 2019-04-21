package J2EE模式.拦截过滤器模式;

public class 过滤管理器 {
    过滤器链 filterChain;

    public 过滤管理器(请求处理程序 target){
        filterChain = new 过滤器链();
        filterChain.setTarget(target);
    }
    public void setFilter(过滤器 filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
