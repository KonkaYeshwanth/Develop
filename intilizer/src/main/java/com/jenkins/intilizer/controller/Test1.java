package com.jenkins.intilizer.controller;

class A{
	void speak() {
		System.out.println("class A");
	}
}

class B extends A{
	void speak() {
		System.out.println("class B");
	}
}

public class Test1 extends B {
 
	protected  String name="Yesh";
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.speak();
	}
}
