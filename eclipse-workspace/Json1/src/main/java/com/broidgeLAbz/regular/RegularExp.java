package com.broidgeLAbz.regular;

import json.bridgelabz.util.Jsonutil;

public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jsonutil u=new Jsonutil();
        String string="Read in the following message: Hello <<name>>, We have your full name\n" + 
		"as <<full name>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\n" + 
		"know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
        System.out.println("Enter User name:");
        String uname = u.getString();
        System.out.println("Enter Full name:");
        String fullname = u.getString();
        System.out.println("Enter contact number");
        String mob = u.getString();
       String date = Jsonutil.currentDateTime();
       string =u.convertString(string, "<<name>>", uname);
       string =u.convertString(string, "<<full name>>", fullname);
       string = u.convertString(string, "xxxxxxxxxx", mob); 
       string = u.convertString(string, "XX/XX/XXXX", date);
       System.out.println(""+string);
	}

}
