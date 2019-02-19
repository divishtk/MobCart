package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FirstMenu 
{
	void searchPhone()
	{
		try
		{
			Connection myConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/database", "sa", "sa");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the phone");
			String phonename=sc.nextLine();
			PreparedStatement ps=myConn.prepareStatement("select mobileName from mobilePhone where mobilename like ?");
			ps.setString(1, "%" + phonename + "%");
				
				ResultSet rs=ps.executeQuery();
				 int i=1;
				 while(rs.next())
				 {
					 System.out.println(i + " " + rs.getString(1));
					 i++;
				 }
				 if(i==1)
				 {
					 System.out.println("No Results Found !");
				 
					sc.close();	
				 }
			

		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	
	void priceRange() 
	{
		try
		{
			Connection myConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/database", "sa", "sa");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the price of the phone between 2 ranges");
			float price1=scan.nextFloat();
			float price2=scan.nextFloat();
			PreparedStatement ps=myConn.prepareStatement("select mobileName,Price from MobilePhone where price BETWEEN ? AND ?");
			ps.setFloat(1,price1);
			ps.setFloat(2,price2);
			
				ResultSet rs=ps.executeQuery();
				int j=1;
				while(rs.next())
				{
					System.out.println(j + " " + rs.getString(1) + " " + rs.getFloat(2));
					j++;
				}
				if(j==1)
					System.out.println("No results found !");
				scan.close();	
			
				
				
				
			
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

	
	
}
