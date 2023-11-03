package org;

public class student {
	int age;
	String name;
	student(int age) {  //class name and constructor name should same
		this.age= age;
	}
	student(int age, String name) {
		this(age);
		this.name = name;
	}
	public static void main(String[] args) {
		student s = new student(22, "Tom");
		System.out.println("Age: "+s.age);
		System.out.println("Name: "+s.name);	
	}
}
