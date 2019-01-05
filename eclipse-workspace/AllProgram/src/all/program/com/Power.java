/*
* Created by:Rohini Patil
* Date 13/12/2018
* Purpose:Power of 2
**/
package all.program.com;

import java.util.Scanner;

import all.program.utility.Utility;



public class Power {
	public static void main(String args[])
	{
		Utility u=new Utility();
		/**
		 * get the value from user
		 */
		System.out.println("Enter Number");
		int num=u.inputInteger();
		//call function
	    u.power(num);
		
		
	}

}
