package com.oopsconcept;

public abstract class Abstraction {
	
	int color;
	abstract void draw();
	public void fill() {
		System.out.println("Hi i am non abstaract method");
	};

}
   class Test extends Abstraction{
	   
	   public static void main(String[] args) {
		   Abstraction a=new Test();
		   a.draw();
		   a.fill();
	   }

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("I am  abstarct method from class Abstraction");
	}
	  
  }