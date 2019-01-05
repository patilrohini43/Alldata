/*
* Created by:Rohini Patil
* Date 15/12/2018
* Purpose:Coupen(Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random
process)
**/

package all.program.com;

import all.program.utility.Utility;

public class Coupen {
	
	public static void main(String args[])
	{
		Utility u=new Utility();
		
		/**
		 * accept the value from user
		*/
		System.out.println("Enter the data you want");
	    String str=u.inputString();
	    
        System.out.println("Coupon Code: " + Utility.coupen(str));
		
	}
		
	
	}


