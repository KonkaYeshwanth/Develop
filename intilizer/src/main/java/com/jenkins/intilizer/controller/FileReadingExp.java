package com.jenkins.intilizer.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExp {
	
	public static void main(String[] args) throws FileNotFoundException {
		String file="C:\\Users\\Pramodh\\Desktop\\text.txt";
		
		File textFile=new File(file);
		Scanner sc=new Scanner(System.in);
		int i,j,z;
		while(sc.hasNext()) {
			//String line=sc.nextLine();
			//System.out.println(line);
			 i = sc.nextInt();
			 j=sc.nextInt();
			 z=i+j;
			System.out.println(z);
			
		}
		sc.close();
		
		
	}

}
