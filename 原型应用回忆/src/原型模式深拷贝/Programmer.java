package 原型模式深拷贝;

/*可以看出来对象并复制，依然使用的是同一个引用。其对象内部的数组、引用对象等都不拷贝，
 * 还是指向原生对象的内部元素地址。下面看深复制的写法，深复制有2种写法，一种是对象实现Cloneable,
 * 另外一种是二进制流。我都一起写了。
*//**
 * 原型模式   程序员
 * @author liaowp
 *
 */
public class Programmer implements Cloneable{
    
    
    private String name;//名字
    
    private  Address address;

    public Programmer(String name,Address address){
        this.name=name;
        this.address=address;
    }
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {  
        Programmer proto = (Programmer) super.clone();  
        proto.address=(Address) address.clone();
        return proto;  
    }  
    
}