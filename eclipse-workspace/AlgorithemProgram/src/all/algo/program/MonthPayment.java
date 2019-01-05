/*
* Created by:Rohini Patil
* Date 21/12/2018
* Purpose:alculate monthlyPayment
**/

package all.algo.program;

import all.program.utility.Utility;

public class MonthPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility u=new Utility();
		//accept the value from user p,r,y
		System.out.println("Enter The Principal Loan Amount");
		double p=u.inputDouble();
		
		System.out.println("Enter The Rate");
		double r=u.inputDouble();
		
		System.out.println("Enter The Year");
		double y=u.inputDouble();
		
		
		System.out.println("Calculates the Monthly Payment is:-" +u.monthPayment(p, r, y));
		
	
	}

}
