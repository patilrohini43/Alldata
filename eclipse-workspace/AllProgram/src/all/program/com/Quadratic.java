/*
* Created by:Rohini Patil
* Date 15/12/2018
* Purpose:find the roots of the equation a*x*x + b*x + c.

**/

package all.program.com;

import java.util.Scanner;

import all.program.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
	
		//accept the value of a,b,c
		System.out.println("Enter A value");
		int a=u.inputInteger();
		
		System.out.println("Enter B value");
		int b=u.inputInteger();
		
		System.out.println("Enter C value");
		int c=u.inputInteger();
		
		//generate the equation
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        System.out.println("******Roots are*****");
        //call root method and find roots
		u.roots(a, b, c);
		
		
	}

}
