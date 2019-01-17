package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.List;

class Human{

	@Override
	public String toString() {
		return "I am Human";
	}
	
	public void greet() {
		System.out.println("I am behivour");
	}
	
}

class Man extends Human{
	@Override
	public String toString() {
		return "I am man";
	}
	public void greeting() {
		System.out.println("I am man method");
	}
	
}

public class GenAndWildcards {
	
	public static void main(String[] args) {
		List<Human> list= new ArrayList<>();
		list.add(new Human());
		list.add(new Human());
		show(list);
		
		List<Man> manlist= new ArrayList<>();
		manlist.add(new Man());
		manlist.add(new Man());
		show(manlist);
	}

	public static void show(List<? extends Human> list) {
		for(Human s:list) {
			System.out.println(s.toString());
			
			s.greet();
			
			
		}
		
	}
	public static void showList(List<? super Man> list) {
		for(Object s:list) {
			System.out.println(s.toString());
		
		}
		
	}
}
