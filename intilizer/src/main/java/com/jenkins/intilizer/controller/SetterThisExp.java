package com.jenkins.intilizer.controller;

class Frog {
	String name;
	int age;

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

public class SetterThisExp {

	public static void main(String[] args) {
		// without setter we need assigen value lik this(frog.name="somefrog")
		// After encapulation
       Frog frog=new Frog();
       frog.setName("Crazy frog");

	}

}
