package 原型模式浅拷贝;


/**
 * 地址
 * @author liaowp
 *
 */
public class Address{

    private String province;//省
    
    private String city;//市
    
    public Address(String province,String city){
        this.province=province;
        this.city=city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    } 
}