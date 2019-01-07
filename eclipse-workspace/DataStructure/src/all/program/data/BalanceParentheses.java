/*
* Created by:Rohini Patil
* Date 31/12/2018
* Purpose:Desc ­> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
**/

package all.program.data;

import java.util.Stack;

import all.program.utility.Utility;

public class BalanceParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility u=new Utility();
		Balance balance=new Balance();
		//accept the value from user
		/**
		System.out.println("Enter the value You Want");
		int num=u.inputInteger();
		**/
		
		
		//enter the expression from user
		System.out.println("Enter Expression");
		String exp=u.inputString();
		Balance.balanceExp(exp);
		
		
	}
}
		
		
		
		
		

	


