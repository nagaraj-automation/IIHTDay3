package com.oopsconcept;

public interface AbstractionInterface {
	public void animal();
	public void car();
	

}
 class Check implements AbstractionInterface{
	 
	 
	 public static void main(String[] args) {
		 AbstractionInterface a=new Check();
		   a.animal();
		   a.car();
	   }

	@Override
	public void animal() {
		System.out.println("Animal eats");
		
	}

	@Override
	public void car() {
		System.out.println("Car is started");
		
	}

 }