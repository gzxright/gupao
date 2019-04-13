package com.prototype;
 
public class Student implements Cloneable{
	private String name;
	Address address;
	public Student(String name, Address address) {
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
	public Student clone(){
		Student s=null;
		try {
			s=(Student)super.clone();
			s.address=(Address)address.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}
