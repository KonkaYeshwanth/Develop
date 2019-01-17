package com.jenkins.intilizer.controller;

class MachineStatus {
	
	public String name="Machine";

	public void start() {
		System.out.println("Machine started");
	}

	public void stop() {
		System.out.println("Machine stopped");
	}

}

class Car extends MachineStatus{

	@Override
	public void start() {
		System.out.println("Car Started:::"+name);
	}
	
}

public class InheritanceExp {
	
	public static void main(String[] args) {
		MachineStatus machine=new MachineStatus();
		machine.start();
		machine.stop();
		
		Car car=new Car();
		car.start();
		
	}

}
