package com.jenkins.intilizer.controller;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=null;
		do {
			System.out.println("Enter proper name::");
			 name=scan.nextLine();
			
		}
		while(!name.equalsIgnoreCase("Yesh"));
		System.out.println("Corrects");
		//scan.close();
	}

}
