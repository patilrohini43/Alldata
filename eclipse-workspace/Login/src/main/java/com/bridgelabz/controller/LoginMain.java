package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.dao.daoimpl.LoginImpl;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     
			// TODO Auto-generated method stub
			
			LoginImpl data=new LoginImpl();
			
		  int choice=0;
		  do
		  {
			  System.out.println("Login Form");
			  System.out.println("1.Register");
			  System.out.println("2.Update Account");
			  System.out.println("3.Delete Account");
			  System.out.println("4.Login");
			  System.out.println("5.Exit");
			  System.out.println("Enter Your Choice");
			  choice=sc.nextInt();
			   switch(choice)
			   {
			   case 1: 
				   
	               System.out.println("Please Enter Your details");		
	               data.insertUser();
	               break;
	               
	               
	               
			   case 2:
				   
				   System.out.println("Update");
				   
				   data.updateUSer();
				   break;
				   
				   
               case 3:
				   
				   System.out.println("Delete");
				   
				   data.deleteUSer();
				   break;
	               
			   case 4:
				   
				   System.out.println("Login User");
				   data.display();
				   break;
				   
			   case 5:
				     System.out.println("Exit");
				     break;
				     default:
				    	 System.out.println("Please Enter Correct choice");
			   }
			  
			  
		  }while(choice!=5);
		 
			
		}

	}


