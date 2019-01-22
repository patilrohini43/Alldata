package com.bridgelabz.dao.daoimpl;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.bridgelabz.dao.LoginData;

import com.bridgelabz.model.User;
import com.bridgelabz.service.ConnectionCon;

public class LoginImpl implements LoginData
{
	Scanner sc=new Scanner(System.in);
	Connection con;
	
	
	
	public void insertUser() {
		
		//Login login=new Login();
		User user=new User();
		// TODO Auto-generated method stub
		System.out.println("Enter User Name");
		String username=sc.nextLine();
		
		System.out.println("Enter User Email");
		String email=sc.nextLine();
		
		System.out.println("Enter Password");
		String password=sc.nextLine();
		
		System.out.println("Enter Confirm Password");
		String confirmpass=sc.nextLine();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setConfirmpass(confirmpass);
		
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");  
			//Connection con=DriverManager.getConnection(  
			//"jdbc:mysql://localhost:3306/mydb","root","root"); 
			
		    con=ConnectionCon.getConnection();
			
			PreparedStatement stmt=con.prepareStatement("INSERT INTO users values ('" + user.getUsername() + "','" + user.getEmail()
            + "','" + user.getPassword() + "','" + user.getConfirmpass() + "')");
			
		    
		  
			
		    stmt.executeUpdate();
		    
		    con.close();
			
			System.out.println("Sing up successfully");
			
		}catch(Exception e)
		{
			System.out.println("Sing up not successfully");
		}
		
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Enter User Email");
		String email=sc.nextLine();
		
		System.out.println("Enter USer PassWord");
		String pass=sc.nextLine();
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","root");  
			con=ConnectionCon.getConnection();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			{
			
				
				if(email.equals(rs.getString("email")) && pass.equals(rs.getString("password")))
				{
					System.out.println("User Login SuccessFully    " +email+"    "+pass);
				}
				
			}
			 rs.close();
			stmt.close();
			con.close();  
			
			}
		catch(Exception e)
		{ 
			System.out.println("User not login");
		} 
		
	}

public void updateUSer() {
		
	
		// TODO Auto-generated method stub
	
	
	//Login login=new Login();
	User user=new User();
		System.out.println("Enter User Name");
		String username=sc.nextLine();
		
		System.out.println("Enter User Email");
		String email=sc.nextLine();
		
		System.out.println("Enter Password");
		String password=sc.nextLine();
		
		System.out.println("Enter Confirm Password");
		String confirmpass=sc.nextLine();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setConfirmpass(confirmpass);
		
		
		try {
		//	Class.forName("com.mysql.jdbc.Driver");  
			//Connection con=DriverManager.getConnection(  
			//"jdbc:mysql://localhost:3306/mydb","root","root"); 
			con=ConnectionCon.getConnection();
			PreparedStatement stmt=con.prepareStatement("UPDATE users set username=?,password=?,confirmpass=? WHERE email=?");
			
		    stmt.setString(1,user.getUsername());
		    stmt.setString(2, user.getPassword());
		    stmt.setString(3, user.getConfirmpass());
		    stmt.setString(4, user.getEmail());
		    
		    
		    
		  
			
		    stmt.executeUpdate();
		    
		    con.close();
			
			System.out.println("Update successfully");
			
		}catch(Exception e)
		{
			System.out.println("not  update successfully");
		}
		
	}

public void deleteUSer() {
	// TODO Auto-generated method stub
	//Login login=new Login();
	User user=new User();
	
	System.out.println("Enter Email id Want to delete record");
	String email=sc.nextLine();
	
	user.setEmail(email);
	try
	{
	//Class.forName("com.mysql.jdbc.Driver");  
	//Connection con=DriverManager.getConnection(  
	//"jdbc:mysql://localhost:3306/mydb","root","root"); 
		con=ConnectionCon.getConnection();
	PreparedStatement stmt=con.prepareStatement("delete from users where email=? ");
	stmt.setString(1,user.getEmail());
	stmt.executeUpdate();
	
	con.close();
	System.out.println("Account Deleted");
}catch(Exception e)
	{
	System.out.println("Account not deleted");
	}
}


	

	

	

}
