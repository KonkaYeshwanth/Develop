package com.jenkins.intilizer.controller;

class robot{
	
	void speak() {
		System.out.println("Robot speaks");
	}
}

public class TestMethodParameters {
	
	public static void main(String[] args) {
		robot r=new robot();
		r.speak();
	}

}
