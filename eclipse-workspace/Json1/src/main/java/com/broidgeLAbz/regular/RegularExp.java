package com.broidgeLAbz.regular;

import json.bridgelabz.util.Jsonutil;

public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create the string
        String string="Read in the following message: Hello <<name>>, We have your full name\n" + 
		"as <<full name>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\n" + 
		"know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
        
        //accept the data from user
        System.out.println(string);
        System.out.println("Enter User name:");
        String uname =Jsonutil.getString();
        
        System.out.println("Enter Full name:");
        String fullname =Jsonutil.getString();
        
        System.out.println("Enter contact number:");
        String mob =Jsonutil.getString();
        
        //display the current date
       String date = Jsonutil.currentDateTime();
       
       //check the pattern and match the string
       string =Jsonutil.convertString(string, "<<name>>", uname);
       string =Jsonutil.convertString(string, "<<full name>>", fullname);
       string = Jsonutil.convertString(string, "xxxxxxxxxx", mob); 
       string = Jsonutil.convertString(string, "XX/XX/XXXX", date);
       //Display string
       System.out.println(""+string);
	}

}
