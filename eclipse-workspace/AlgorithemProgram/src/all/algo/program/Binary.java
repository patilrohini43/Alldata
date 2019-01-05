/*
* Created by:Rohini Patil
* Date 24/12/2018
* Purpose:Write Binary.java to read an integer as an Input, convert to Binary using toBinary
function
**/

package all.algo.program;

import all.program.utility.Utility;

public class Binary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Utility u=new Utility();
		 System.out.println("Enter The Number");
		 int n=u.inputInteger();
		 //call the binary method
		 int[] b=u.toBinary(n);
		 System.out.println("Binary is:");
		 u.showArr(b);    //print array
		
		System.out.println("after Swap");
		u.swap(b);    //swapped 
		u.showArr(b);  //print
		//call the decimal function 
		System.out.println("Decimal Number"+u.todecimal(b));
	

	}

}
