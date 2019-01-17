package com.jenkins.intilizer.controller;

public class RecursionExp {
	
	public static void main(String[] args) {
		System.out.println(calculate(9));
	}
	
	public static int calculate(int value)
	{
		System.out.println(value);
		if(value ==1) {
			return 1;
		}
		return calculate(value -1)*value;
	}
}
