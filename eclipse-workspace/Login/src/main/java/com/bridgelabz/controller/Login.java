package com.bridgelabz.controller;
/**
package com.bridgelabz.demo;


import java.sql.*;

public class Login {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","root");  
		
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from user");  
			while(rs.next())  
			{
				String id=rs.getString("userid");
				String pass=rs.getString("password");
				
				System.out.println("User Id is:-"+id);
				System.out.println("Password Is:-"+pass);
			}
			 
			con.close();  
			
			}
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
		
			} 
	
			}  

**/