package 原型模式深拷贝;


/**
 * 原型模式
 * @author liaowp
 *
 */
public class Client {
    
    public static void main(String[] args) throws CloneNotSupportedException {    
        //深复制复制
        Address address=new Address("上海","浦东");
        Programmer a=new Programmer("高科技",address);
        a.setAddress(new Address("北京", "朝阳"));
        a.setName("刘岩");
        Programmer b=(Programmer) a.clone();
        b.setName("高兴");
        b.getAddress().setProvince("成都");
        b.getAddress().setCity("火锅");
        System.err.println(b.getName()+b.getAddress().getProvince()+b.getAddress().getCity());
        System.err.println(a.getName()+a.getAddress().getProvince()+a.getAddress().getCity());    
    }
}