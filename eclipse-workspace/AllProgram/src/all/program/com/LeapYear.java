/*
* Created by:Rohini Patil
* Date 13/12/2018
* Purpose: Leap Year
**/
package all.program.com;


import all.program.utility.Utility;

public class LeapYear {
	public static void main(String args[])
	{
	    Utility u=new Utility();
	    
	     //accept the value from user
	     
		System.out.println("Enter Year u want");
		int year=u.inputInteger();
		
		//call function
		u.leapYear(year);
		
			
	}

}
