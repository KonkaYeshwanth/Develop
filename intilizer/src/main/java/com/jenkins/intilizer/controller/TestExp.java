package com.jenkins.intilizer.controller;

class Person{
	// class is templete to create  object
	// classes contain
	// 1.Data
	private String name;
	int id;
	int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static void speakStatic(){
		System.out.println("Iam Static method");
	}
	
	void speak(){
		System.out.println("Iam method");
	}
	
	int ageofP(int age) {
		System.out.println(age);
		return age;
	}
	
}

public class TestExp {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("yesh");
	p.id=1;
	p.speak();
	p.ageofP(27);
	Person.speakStatic();
}
}
