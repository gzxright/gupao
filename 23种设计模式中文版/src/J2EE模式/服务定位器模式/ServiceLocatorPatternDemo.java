package J2EE模式.服务定位器模式;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = 服务定位器.getService("Service1");
        service.execute();
        service = 服务定位器.getService("Service2");
        service.execute();
        service = 服务定位器.getService("Service1");
        service.execute();
        service = 服务定位器.getService("Service2");
        service.execute();
    }
}