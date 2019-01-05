/*
*Created by:Rohini Patil
* Date 14/12/2018
* Purpose: Print the prime factors of number N.
**/


package all.program.com;

import all.program.utility.Utility;

public class PrimeFactor {
	public static void main(String args[])
	{
		Utility u=new Utility();
		System.out.println("Enter the prime factor of number");
		
		int n=u.inputInteger();
		
		 //Call Prime function
		 
		u.primeNum(n);
	}

	

}
