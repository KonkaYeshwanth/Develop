package com.jenkins.intilizer.controller;

import com.begin.main.Exp.inner;

class Exp{
	
	public void start() {
		System.out.println("I am exp");
	}
	class plant{
		public void plant() {
			System.out.println("I am plant");
		}
	}
	
	static class inner{
		
		public void inner() {
			System.out.println("I am static inner");
		}
	}
	
}

interface grow{
	 void grow();
}

public class AnnonmyusClassExp {
	
	private int num=7;
	
	public void innerExp() {
		
		class innerMethodClass{
			
			public void innerClassMethod() {
				System.out.println("I am method inner::"+ num);
			}
			
		}
		innerMethodClass i=new innerMethodClass();
		i.innerClassMethod();
	}
	
	public static void main(String[] args) {
		
		Exp e=new Exp(){
			@Override
			public void start() {
				System.out.println("I am inner");
			}
		};
		e.start();
		
		grow g=new grow() {
			
			@Override
			public void grow() {
				System.out.println("I am grow");
				
			}
		};
		g.grow();
		Exp.plant e1=new Exp().new plant();
		e1.plant();
		
		inner in=new inner();
		in.inner();
		
		AnnonmyusClassExp e2=new AnnonmyusClassExp();
		e2.innerExp();
		
		
	}

}
