package com.bridgelabz.service;

import java.sql.*;
public class ConnectionCon {
	
	public static String URL="jdbc:mysql://localhost:3306/mydb";
	public static String Username="root";
	public static String Password="root";
	
	
	public static Connection getConnection() {
        Connection connection = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, Username, Password);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return connection;
    }

}
