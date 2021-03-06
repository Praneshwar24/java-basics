package Basics;

import objectclass.Util;

public class Student {
	
	String name;
	int age;
	
/**
 * default constructor -- naruto	
 */
	
public Student() {
	System.out.println("naruto constructor");
}

/**
 * sasuke constructor
 * @param name
 */
	public Student(String name) {
		this.name = name;
		System.out.println("sasuke constructor");
	}

/**
 * this is kakashi constructor
 * @param name
 * @param age
 */
	public Student(String name, int age) {
		System.out.println("kakashi constructor");
		this.name = name;
		this.age = Util.incrementByTen(age);
	}

	static String COLLEGE_NAME = "IIT";
	
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
	
}





	
	
	