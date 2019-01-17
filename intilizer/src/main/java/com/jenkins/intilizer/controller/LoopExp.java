package com.jenkins.intilizer.controller;

public class LoopExp {
	
	public static void main(String[] args) {
//		int value =0;
//		while(value < 10) {
//			System.out.println("In while loop");
//			value++;
//			System.out.println(value);
//		}
//	
//		for(int i=0;i<5; i++) {
//			System.out.printf("The value of i %d",i);
//		}
		int i=0;
//		if(i ==4) {
//			System.out.println("Correct");
//		}else {
//			System.out.println("Not correct");
//		}
//		
		while(i < 5) {
			System.out.println("Lopping:::" +i);
			if(i == 5) {
				break;
			}
			i++;
			System.out.println("Loop Running");
		}
		}

}
