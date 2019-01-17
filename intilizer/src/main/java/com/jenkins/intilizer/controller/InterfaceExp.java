package com.jenkins.intilizer.controller;

interface Common{
	
	void info();
}

class Sample implements Common{
	private String name;
	
	public Sample(String name) {
		this.name = name;
	}

	public void start() {
		System.out.println("Started");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}
}

class Simple implements Common{
	private int id=7;
	
	public void greet() {
		System.out.println("Hello");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(id);
	}
	
}
public class InterfaceExp {
	
	public static void main(String[] args) {
        Common s=new Sample("Yesh");
		Common s1=new Simple();
		s.info();
		s1.info();
		outputInfo(s);
		outputInfo(s1);
	}
	
	private static void outputInfo(Common common) {
		common.info();
	}

}
