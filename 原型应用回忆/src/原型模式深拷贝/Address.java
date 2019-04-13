package 原型模式深拷贝;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 地址
 * @author liaowp
 *
 */
public class Address implements Cloneable{

    private String province;//省
    
    private String city;//市
    
    public Object clone(){
        
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return address;
    }
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

       /* 深复制    二进制的写法，需要类序列化 */
        public Object deepClone() throws IOException, ClassNotFoundException {	 
  
                  /* 写入当前对象的二进制流 */  
                  ByteArrayOutputStream bos = new ByteArrayOutputStream();  
                  ObjectOutputStream oos = new ObjectOutputStream(bos);  
                  oos.writeObject(this);  
  
                  /* 读出二进制流产生的新对象 */  
                  ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
                  ObjectInputStream ois = new ObjectInputStream(bis);  
                  return ois.readObject();  
       }
}