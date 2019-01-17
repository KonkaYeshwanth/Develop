package com.jenkins.intilizer.controller;

class Thing{
	 public String name;
	 public static String description;
	 public final static int LUCKY_NUMBER=1;
	 public static int count=0;
	 public int id;
	 
	 public Thing() {
		 id=count;
		 count++;
	 }
	 
	 public void show() {
		 System.out.println(description);
	 }
}
public class StaticExp {
	
	public static void main(String[] args) {
		
		System.out.println("Before creating:::"+Thing.count);
		Thing t=new Thing();
		t.name="mixer";
		Thing.description="working";
		t.show();
		Thing t1=new Thing();
		t1.name="Fan";
		System.out.println("After creating:::"+Thing.count);
		Thing.description="Not working";
		System.out.println(t.name+"::::"+t.id+"::::"+Thing.description);
		System.out.println(t1.name+"::::"+t1.id+"::::"+Thing.description);
		System.out.println(Math.multiplyExact(12, 18));
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
