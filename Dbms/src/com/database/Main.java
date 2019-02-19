package com.database;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int md;
		
		User us9=new User();
		
		
		
		System.out.println("Welcome to PhoneCart");
		System.out.println("1. Login");
		System.out.println("2. SignUp");
		System.out.println("3. Skip");
		
		md=sc.nextInt();
		
		int check=1;
		
		switch(md)
		{
		case 1:
			User user1=new User();
			//user1.Login();
			
			/*if(user1.Login()==0)
			{
				 user1.Login();
			}
			else
			{
				//user1.Signup();
				
				
			}*/
			
			/*if(user1.Login()==1)
			{
			System.out.println("Main Menu");
			
			System.out.println("1. Search Phone");
			System.out.println("2. Search Price");
			System.out.println("3. Advanced Search");
			System.out.println("4. View Cart");
			int md2;
			md2=sc.nextInt();
			
			FirstMenu fm1= new FirstMenu();
			
			switch(md2)
			{
			
			case 1:
				fm1.searchPhone();
				break;
			
			case 2:
				fm1.priceRange();
				break;
			}
			
			
		
			
			}
			//else if(user1.Login()==0)
			//{
			//	System.out.println("Try Loggin Again!");

				
		//	}
			else
			{
				System.out.println("Try Loggin Again!");
			}*/
			
			
			break;
			
			
			
			case 2:
			User user2=new User();
			user2.Signup();
			//int md2;
			System.out.println("You have been signed up!");
			System.out.println("-----------------------------------------------------");
			System.out.println("Do u want to login?? Y/N");
			//System.out.println("press  for login and 0 for not");

		//	System.out.println("1. Login");
			//System.out.println("2.SignIp Again?");
			
			
			char ch=sc.next().charAt(0);
			
			if(ch=='Y'|| ch=='y')
			{
				user2.Login();
				
			}
			if(ch=='n'|| ch=='N')
			{
				
				user2.Signup();
			}
			
			
			/*int i=sc.nextInt();

			if(i==1)
			{
				user2.Login();
				
			}
			if(i==0)
			{
				
				user2.Signup();
			}*/
			
		
			
			
			
			
			
					//nested switch
					/*switch(md2)
					{
					case 1:
						User u=new User();
						u.Login();
						break;
					
					case 2:
						User u1=new User();
						u1.Signup();
						break;
						default:
					}*/
			
			//System.out.println("Now You Can Login??!");
			//user2.Login();
	
			break;
			
			
		}
		
		
		if(us9.Login()==1)
		{
			
			
			System.out.println("Main Menu");
			
			System.out.println("1. Search Phone");
			System.out.println("2. Search Price");
			System.out.println("3. Advanced Search");
			System.out.println("4. View Cart");
		}
		
		else
		{
			
			System.out.println("Try Loggin Again!");

		}
		
			int md2;
			md2=sc.nextInt();
			
			FirstMenu fm1= new FirstMenu();
			
			switch(md2)
			{
			
			case 1:
				fm1.searchPhone();
				break;
			
			case 2:
				fm1.priceRange();
				break;
			}
		
			
			
			
		
	
		
		
			
		

	}

}
