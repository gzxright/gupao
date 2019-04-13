package com.prototype;
 
public class Address  implements Cloneable{
	private String location;
	public Address(String location){
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Address clone(){
		Address a=null;
		try {
			a=(Address)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
 
}