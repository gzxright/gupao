package com.prototype;
 
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
 
public class Author implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 2719717328965672807L;
 
	private String name;
	Address address;
 
	public Author(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Address getAddress() {
		return address;
	}
 
	public void setAddress(Address address) {
		this.address = address;
	}
	// 使用序列化技术实现完全拷贝
 
	public Author absoluteClone() throws IOException, ClassNotFoundException, OptionalDataException
 
	{
 
		// 将对象写入流中
 
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
 
		ObjectOutputStream oos = new ObjectOutputStream(bao);
 
		oos.writeObject(this);
 
		// 将对象从流中取出
 
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
 
		ObjectInputStream ois = new ObjectInputStream(bis);
 
		return (Author) ois.readObject();
 
	}
}
