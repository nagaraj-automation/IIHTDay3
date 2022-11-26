package com.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambda {
	public static void main(String[] args) {
		
		List<Integer> list1=List.of(2,4, 6,8,7,9,11);
		// count the even numbers in a list
		 Stream<Integer> count=list1.stream().filter(p->p%2==0);
		 System.out.println(count.count());
		 // prints the list of even numbers
		 List<Integer> even=list1.stream().filter(p->p%2==0).collect(Collectors.toList());
		
		  System.out.println(even);
		  
		  
		  //Squaring the list element
		  List<Integer> suaredList=list1.stream().map(p->p*2).collect(Collectors.toList());
			
		  System.out.println(suaredList);
		  
		  //List in sorted order
		  List<Integer> sortedList=list1.stream().sorted((a,b)->a-b).collect(Collectors.toList());
		  System.out.println(sortedList);
			
		  ///remove duplicate element in array
		  List<Integer> list2=List.of(2,4,4, 6,8,8,7,9,9,9,11,11,2);
		  List<Integer> newList=list2.stream().distinct().collect(Collectors.toList());
		  System.out.println(newList);
		  
		  
		  
	}
	
	
	
	
	
     
	
}


class Employee{
	int employeeid;
	String employeeName;
	String city;
	public Employee(int employeeid, String employeeName, String city) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.city = city;
	}
	
}
