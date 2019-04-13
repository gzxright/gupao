package com.prototype;
 
import java.io.IOException;
import java.io.OptionalDataException;
 
/**
 * 完全拷贝测试类
 * 
 * @author vean
 *
 */
public class AbsoluteCopying {
 
	public static void main(String[] args) throws OptionalDataException, ClassNotFoundException, IOException {
		try {
		Address address = new Address("南京");
		Author author = new Author("老王", address);
		Author cloneAuthor = author.absoluteClone();
		System.out.println("原作者作者姓名:  " + author.getName() + " 住址:  " + author.getAddress().getLocation());
		System.out.println("克隆作者姓名:  " + cloneAuthor.getName() + " 住址:  " + cloneAuthor.getAddress().getLocation());
		System.out.println("修改原作者姓名为 隔壁老王，住址为 北京");
		author.setName("隔壁老王");
		author.setAddress(new Address("北京"));
		System.out.println("原作者作者姓名:  " + author.getName() + " 住址:  " + author.getAddress().getLocation());
		System.out.println("克隆作者姓名:  " + cloneAuthor.getName() + " 住址:  " + cloneAuthor.getAddress().getLocation());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
