package com.jenkins.intilizer.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class CustomException {
	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

public class ExceptionExp {

	public static void main(String[] args) {
		File f = new File("Text.txt");

		try {
			readFile(f);
		} catch (FileNotFoundException e) {
			CustomException c = new CustomException();
			c.setDescription("File not found with name::" + f.getName());
			System.out.println(c.getDescription());
		}
		System.out.println("Catched..");
	}

	public static void readFile(File f) throws FileNotFoundException {
			FileReader fileReader = new FileReader(f);
	}

}
