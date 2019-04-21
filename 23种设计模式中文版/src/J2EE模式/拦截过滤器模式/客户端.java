package J2EE模式.拦截过滤器模式;

public class 客户端 {
    过滤管理器 filterManager;

    public void setFilterManager(过滤管理器 filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
