package com.jenkins.intilizer.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionsExp {
	
	public void run() throws IOException, ParseException {
		//throw new IOException();
		throw new ParseException("Could not parse at line ::",1);
	}
	
	public void read() throws IOException, FileNotFoundException {
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		MultipleExceptionsExp m=new MultipleExceptionsExp();
		
			/*try {
				m.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				System.out.println("Could not parse");
			}*/
		
		//java 1.7 multi catch
		/*try {
			m.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			m.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			m.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
