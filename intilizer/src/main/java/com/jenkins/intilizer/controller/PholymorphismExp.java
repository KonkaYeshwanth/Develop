package com.jenkins.intilizer.controller;

class Plant{
	
	public void grow() {
		System.out.println("Plant Growing");
	}
	
	public void height() {
		System.out.println("Plant height i1 3mts");
	}
}

class Tree extends Plant{
	@Override
	public void grow() {
		System.out.println("Tree Growing");
	}
	
}

public class PholymorphismExp {
	
	public static void main(String[] args) {
		
		Plant p=new Plant();
		Tree t=new Tree();
		Plant p1=t;
		p1.grow();
		doGrow(p1);
	   
	}
	public static void doGrow(Plant plant) {
		plant.grow();
		
	}

}
