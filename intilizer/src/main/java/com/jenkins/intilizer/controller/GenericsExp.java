package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

class Dog extends Animal{
	
}


public class GenericsExp {
	
	public static void main(String[] args) {
		//Before java 1.5
		
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Cucumber");
		String fruit=(String)list.get(0);
		//After java 1.5
		ArrayList<String> listOfStrings=new ArrayList<String>();
		listOfStrings.add("Yesh");
		listOfStrings.add("ram");
		String name=listOfStrings.get(0);
		
		//////perameterized class////
		
		HashMap<Integer, String> map=new HashMap<>();
		ArrayList<Animal> listOfAnimals=new ArrayList<>();
		listOfAnimals.add(new Animal());
		listOfAnimals.add(new Dog());
		
	}

}
