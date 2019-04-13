
package com.prototype;
 
/**
 * 深拷贝测试类
 * 
 * @author vean
 *
 */
public class DeepCoping {
 
	public static void main(String[] args) {
		try {
			Address address = new Address("北京");
			Student s = new Student("张三", address);
			Student sclone = (Student) s.clone();
			System.out.println("学生姓名：" + s.getName() + "   克隆学生姓名：" + sclone.getName());
			System.out.println("学生地址：" + s.address.getLocation() + "   克隆学生地址：" + sclone.address.getLocation());
			System.out.println("两个学生对象"+(s == sclone?"相同":"不同"));  //测试被可伶的对象与原对象是否是同一个对象 
			System.out.println("修改被克隆学生姓名为李四，地址为四川，");
			s.setName("李四");
			s.address.setLocation("四川");
			System.out.println("学生姓名：" + s.getName() + "   克隆学生姓名：" + sclone.getName());
			System.out.println("学生地址：" + s.address.getLocation() + "   克隆学生地址：" + sclone.address.getLocation());
			// 浅复制只复制值类型的变量和对对象的引用
			// 深复制不仅复制值类型的变量，把原对象引用的对象也进行复制.
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
