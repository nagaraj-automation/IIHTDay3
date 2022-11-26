package com.oopsconcept;

public class Inheritance {
	public void start() {
		System.out.println("car starts");
	}
	public void stop() {
		System.out.println("car stops");
	}
	public void refuel() {
		System.out.println("car refuel");
	}
}


class BMW extends Inheritance{
	
	public void color() {
		System.out.println("My color is Red");
	}
	
	public void prize() {
		System.out.println("My prize is 20lakh");
	}
	public static void main(String[] args) {
		
		BMW i=new BMW();
		i.start();
		i.stop();
		i.refuel();
		i.color();
		i.prize();
		
	}
	
}