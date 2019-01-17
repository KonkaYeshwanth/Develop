package com.jenkins.intilizer.controller;

class Person1{
	private int id;
	private String name;
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class EqualsExp {

	public static void main(String[] args) {
		
		String r="Ram";
		String r1="Ram";
		String s=new String("Sai");
		String s1=new String("Sai");	
		Person1 p=new Person1(1, "Yesh");
		Person1 p1=new Person1(2, "Ravi");
		System.out.println(p.equals(p1));
		System.out.println(r.equals(r1));
		System.out.println(r==r1);
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}
