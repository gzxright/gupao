package J2EE模式.服务定位器模式;

public class 服务定位器 {
    private static 缓存 缓存;

    static {
        缓存 = new 缓存();
    }

    public static Service getService(String jndiName){

        Service service = 缓存.getService(jndiName);

        if(service != null){
            return service;
        }

        初始配置 context = new 初始配置();
        Service service1 = (Service)context.lookup(jndiName);
        缓存.addService(service1);
        return service1;
    }
}