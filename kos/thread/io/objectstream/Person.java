package io.objectstream;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name; 
	private int age;
	private double height;
	private char bloodtype;
	
	
	
	
	//위의 멤버변수가 private이기 때문에 세터와 게터를 이용해서 접근해야 함.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getBloodtype() {
		return bloodtype;
	}
	public void setBloodtype(char bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	

}
