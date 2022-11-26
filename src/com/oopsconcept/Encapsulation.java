package com.oopsconcept;

public class Encapsulation {

	private String employeeName;
	private String city;
	private int id;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
 class Employee extends Encapsulation{
	 public static void main(String[] args) {
		 
		 Encapsulation e=new Employee();
		 e.setId(20);
		 e.setEmployeeName("Nagaraj");
		 e.setCity("Bangalore");
		 
		 System.out.println("Employee Nam is"+e.getEmployeeName()+"id is"+e.getId()+"City is"+e.getCity());
		 
		 
	 }
	 
	 
 }