/*
* Created by:Rohini Patil
* Date 14/12/2018
* Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
**/

package all.program.com;

import java.util.Scanner;

import all.program.utility.Utility;

public class Harmonic {
	public static void main(String args[])
	{
		Utility u=new Utility();
		double result=0,j=0,num=0;
		
		 //Take input number from user
		 
		System.out.println("Enter the harmonic you want to find");
		int n=u.inputInteger();
		
		
          
		result=u.harmonic(n);
		//print the harmonic number
        System.out.println("the value of harmonic no. " + n + " is: " + result);
}
	
}