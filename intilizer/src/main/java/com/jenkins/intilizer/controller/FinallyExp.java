package com.jenkins.intilizer.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinallyExp {
	
	public static void show(String name) throws Exception {
//		try(if()){
//			throw new IOException();
//		}catch (FileNotFoundException e ) {
//		      System.out.println("File not found, resetting score.");
//		      return 0;
//		    }
//		throw new Exception();
//	
	}
	
	public static int getPlayerScore(String playerFile) {
	    try (Scanner contents = new Scanner(new File(playerFile))) {
	      return Integer.parseInt(contents.nextLine());
	    } catch (FileNotFoundException e ) {
	      System.out.println("File not found, resetting score.");
	      return 0;
	    }
	}
	public static void main(String[] args) {
		getPlayerScore("Yesh");
		try {
			show("get");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception catched in first catch");
			//throw new RuntimeException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception catched");
			throw new RuntimeException();
		}
		finally {
			System.out.println("Finally Block");
		}
		
		
	}

}
