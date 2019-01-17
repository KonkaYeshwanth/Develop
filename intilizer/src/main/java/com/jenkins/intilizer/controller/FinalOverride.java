package com.jenkins.intilizer.controller;

class Super{
	
	public final  void show() {
		System.out.println("I am final");
	}
}

public class FinalOverride extends Super{
	//cannot override fiinal method
//	public void show() {
//		
//	}
	public static void main(String[] args) {
		 
	}

}
