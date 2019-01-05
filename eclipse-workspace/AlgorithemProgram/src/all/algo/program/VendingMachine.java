/*
* Created by:Rohini Patil
* Date 20/12/2018
* Purpose:Find the Fewest Notes to be returned for Vending Machine

**/

package all.algo.program;

import all.program.utility.Utility;

public class VendingMachine {

	static int i=0;
	static int total=0;
	static int[] notes = { 1000,500,100,50,10,5,2,1};
	static int money;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u =new Utility();
		/**enter the from user
		 * 
		 */
		System.out.println("Enter The Amount:-");
		int money=u.inputInteger();
		/**
		 * call the calculate method for count how much Rs,note
		 **/
	     total +=u.cal(money, notes);
	     /**total function return total number of notes
	      * **/
	   
		System.out.println("Total Number of Notes is:-" + u.total);
		

	}

}
