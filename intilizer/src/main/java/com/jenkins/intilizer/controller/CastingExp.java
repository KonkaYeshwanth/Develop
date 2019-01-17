package com.jenkins.intilizer.controller;
class mac{
	public void start() {
		System.out.println("Started");
	}
}

class Android extends mac{
	
	public void start() {
		System.out.println("Android Started"); 
	}
	public void snap() {
		System.out.println("Android snap"); 
	}
}
public class CastingExp {

	public static void main(String[] args) {
		int number = 7;
		short num = 10;
		byte b=76;
		float f=22.6f;
		double d=22.67;
		long value=323223;
		number=(int)value;
		d=number;
		System.out.println(number+":::"+d);
		
		mac m=new mac();
		Android a=new Android();
		
		//upcast
		mac m1=a;
		m1.start();
		
		//downcast
		mac m3=new Android();
		Android a1=(Android)m3;
		a1.start();
		a1.snap();
		
	}

}
