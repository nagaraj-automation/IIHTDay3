package com.oopsconcept;

public class Polymorphism {
	public static void main(String [] args) {
		
		BENZ b=new BENZ();//Static polymorphism-compile time 
		
		b.start();
		b.stop();
		b.refuel();
		b.engine();
		b.safety();
		
		Car c=new BENZ();//Dyanamic polymorphism -run time
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Vehicle v=new BENZ();
		v.engine();
		
		Vehicle v1=new Car();
		v1.engine();
		
		
		
		
		
		
	}

}

class Vehicle {
	public void engine() {
		System.out.println(" I am engine");
	}
}

class Car extends Vehicle {
	public void start() {
		System.out.println("car starts");
	}
	
	public void stop() {
		System.out.println("car stops");
	}
	
	public void refuel() {
		System.out.println("car refuels");
	}
}

class BENZ extends Car{
	public void start() {
		System.out.println(" BENZ car starts");
	}
	
	public void stop() {
		System.out.println(" BENZ car stops");
	}
	
	public void refuel() {
		System.out.println(" BENZ car refuels");
	}
	
	public void safety() {
		System.out.println(" BENZ car safety feature");
	}
	
}