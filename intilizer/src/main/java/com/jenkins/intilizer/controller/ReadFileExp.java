package com.jenkins.intilizer.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExp {

	public static void main(String[] args) {
		File f = new File("teset.txt");
		try(FileReader fr = new FileReader(f);BufferedReader br = new BufferedReader(fr);){
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
		}
		} catch (FileNotFoundException e) {
			System.out.println("File not found::" + e.getMessage());
		} catch (IOException e) {
			
		}
		
//		BufferedReader br=null;
//		try {
//			FileReader fr = new FileReader(f);
//			 br = new BufferedReader(fr);
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found::" + e.getMessage());
//		} catch (IOException e) {
//			
//			
//		}
//              try {
//            	  if(br != null) {
//            		  br.close();
//            	  }
//				
//				
//			} catch (IOException e) {
//			
//				
//			}
	}

}
