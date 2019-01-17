package com.jenkins.intilizer.controller;

interface AC{
	
	String des="Greet";
}

abstract class AB {
	String name;
	public void show() {
		System.out.println("absract");
	}

	public void move() {

	}

}

public class AbstractExp extends AB {
//	public void show() {
//		System.out.println("Method ..");
//	}

	public static void main(String[] args) {
		AbstractExp a = new AbstractExp();
		a.show();
	}

}
