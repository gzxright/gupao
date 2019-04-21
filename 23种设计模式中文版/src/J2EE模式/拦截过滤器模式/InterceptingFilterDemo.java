package J2EE模式.拦截过滤器模式;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        过滤管理器 filterManager = new 过滤管理器(new 请求处理程序());
        filterManager.setFilter(new 认证过滤器());
        filterManager.setFilter(new BUG过滤器());

        客户端 client = new 客户端();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}