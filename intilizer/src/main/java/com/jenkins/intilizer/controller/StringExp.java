package com.jenkins.intilizer.controller;

public class StringExp {
	
	public static void main(String[] args) {
		
		String info="";
		System.out.println(info.hashCode());
		info += "I am hero";
		System.out.println(info.hashCode());
		info +="I am   string";
		System.out.println(info.hashCode());
		
		StringBuilder sb=new StringBuilder();
		sb.append("I am builder. ");
		sb.append("I am modified");
		System.out.println(sb);
	}

}
