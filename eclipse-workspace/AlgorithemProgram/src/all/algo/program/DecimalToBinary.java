/*
* Created by:Rohini Patil
* Date 21/12/2018
* Purpose:Decimal to Binary with display power
**/

package all.algo.program;

import all.program.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("Enter The Decimal Number You Want");
		int n=u.inputInteger();
		int a = 0;
		System.out.println("Decimal Number is: " +Utility.decimalTobinary(n) );
		
	}

}
