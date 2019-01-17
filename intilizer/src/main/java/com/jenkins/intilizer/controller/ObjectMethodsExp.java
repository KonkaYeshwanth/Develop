package com.jenkins.intilizer.controller;

class Frogs{
	String name;
	String des;
	
	public String toString() {
		return name+" "+des;
	}
}

public class ObjectMethodsExp {
	
	public static void main(String[] args) {
		Frogs f=new Frogs();
		f.name="Freedy";
		f.des="Crazy";
		
		System.out.println(f.toString());
	}

}
