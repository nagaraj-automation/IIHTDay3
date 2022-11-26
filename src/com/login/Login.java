package com.login;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Login {
	
	void login() throws ClassNotFoundException
	{
	Scanner sc= new Scanner(System.in);
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/tweet","root","pass@word1");  

	String un1="-",pw1="-",un,pw;
	System.out.println("Enter Username");
	un=sc.nextLine(); 
	System.out.println("Enter Password");
	pw=sc.nextLine(); 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from register");  
	while(rs.next())  
	{
	un1=rs.getString(4);
	pw1=rs.getString(5);  
	}

	if ((un.equals(un1)) && (pw.equals(pw1)))
	{
	System.out.println("Login Successfull");

	}
	}catch (SQLException e){}
		
	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {
		DataInputStream obj=new DataInputStream(System.in);
		System.out.println(" Login");
		Login x1=new Login();
        x1.login();
	}
}
