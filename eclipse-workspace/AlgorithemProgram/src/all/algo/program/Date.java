/*
* Created by:Rohini Patil
* Date 20/12/2018
* Purpose:Takes a date as input and prints the day of the week that date falls on.

**/
package all.algo.program;

import all.program.utility.Utility;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
		        "Friday", "Saturday" };
		System.out.println("Enter the Date");
		//Entering the Value from the user
		int d=u.inputInteger();
		int m=u.inputInteger();
		int y=u.inputInteger();
		
		/**
		 * Call the method of date from utility
		 */
		   int day=u.date(d, m, y);
		   System.out.println("Date is"+d+"/"+m+"/21"+y);
	System.out.println("The Date is " + u.date(d, m, y));
	    
	System.out.println("on " + strDays[day]);

	}

	
}
