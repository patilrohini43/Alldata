/*
* Created by:Rohini Patil
* Date 22/12/2018
* Purpose:sqrt to compute the square root of a nonnegative number c
given in the input using Newton's method
**/

package all.algo.program;

import all.program.utility.Utility;

public class SqrtNewton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("Enter the number c");
		double c=u.inputDouble();
		//print the estimate of the square root of c
		System.out.println(" The estimate of the square root of c :-"+u.newTon(c));
		

	}

}
