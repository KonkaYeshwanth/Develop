package com.jenkins.intilizer.controller;

class Machine{
	private String name;
	private String sparePart;
	public String getName() {
		return name;
	}
	public String getSparePart() {
		return sparePart;
	}
	public Machine(String name, String sparePart) {
		super();
		this.name = name;
		this.sparePart = sparePart;
		System.out.println("Perameterized Constructor running!!");
	}
	//constructor does'nt have any return type
	//And name of constructor is name of class
	public Machine() {
		this("Dell","Speaker");
		System.out.println("Constructor running!!");
	}
}

public class ConstructorExp {
	
	public static void main(String[] args) {
		Machine m=new Machine();
		Machine m1=new Machine("Lenove machine","Hard disk" );
		System.out.println(m.getName()+"::::"+m1.getName());
		
	}

}
