package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class User
{
	
void Signup()//public static void main(String args[])
{
	// TODO Auto-generated method stub
{
	try
	{
		Scanner scn=new Scanner(System.in);
		
		String username;
		System.out.println("enter username (lenght should be 10)");
		username=scn.nextLine();
		
		String firstName;
		System.out.println("enter firstName");
		firstName=scn.nextLine();
		
		String middleName;
		System.out.println("enter middleName");
		middleName=scn.nextLine();
		
		String lastName;
		System.out.println("enter lastName");
		lastName=scn.nextLine();
		
		String emailId;
		System.out.println("enter emailId");
		emailId=scn.nextLine();
		
		String password;
		System.out.println("enter password");
		password=scn.nextLine();
		
		String phoneNo;
		System.out.println("enter contact details");
		phoneNo=scn.nextLine();
		
		
		//Class.forName ("org.h2.Driver"); 
Connection myConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/database", "sa", "sa");
		
		
PreparedStatement  myStmt = myConn.prepareStatement("insert into user(username,password,firstName,middleName,lastName,emailId) values(?,?,?,?,?,?)");
myStmt.setString(1, username);
myStmt.setString(2, password);
myStmt.setString(3, firstName);
myStmt.setString(4, middleName);
myStmt.setString(5, lastName);
myStmt.setString(6, emailId);
myStmt.executeUpdate();


PreparedStatement mystmt2= myConn.prepareStatement("insert into phoneno(username,phoneNo) values(?,?)");
mystmt2.setString(1, username);
mystmt2.setString(2, phoneNo);
mystmt2.executeUpdate();


System.out.println("Added");
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		
	}

}
	
}


int Login()
{
	int check=0;
	
	try
	{

		Scanner scn=new Scanner(System.in);
		String username = null;
		System.out.println("Enter Username ");
		username=scn.nextLine();
		
		String password;
		System.out.println("Enter Password ");
		password=scn.nextLine();
		
		
		
		
		//getting connection
		Connection myConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/database", "sa", "sa");
		PreparedStatement stmt= myConn.prepareStatement("select * from user where username=? and password=?");
		stmt.setString(1,username);
		stmt.setString(2,password);
		ResultSet rs=stmt.executeQuery();
		
				if(rs.first()==false)
				{
					System.out.println("Wrong Username Or Password");
					System.out.println();
					check=0;
				}
				else
				{
				System.out.println("Successfully logged in");
				System.out.println();
				check=1;
				}
		

		
		
	}
	
	catch(Exception e)
	{
		
		System.out.println(e.getMessage());
	}
	
	
	return check;

	
	
	
}


	
	
}
