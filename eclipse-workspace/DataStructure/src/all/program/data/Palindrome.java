/*
* Created by:Rohini Patil
* Date 2/01/2019
* Purpose:Desc ­> TA palindrome is a string that reads the same forward and backward, for
example, radar, toot, and madam. We would like to construct an algorithm to
input a string of characters and check whether it is a palindrome.
**/

package all.program.data;

import all.program.utility.Utility;

public class Palindrome {
	public static void main(String[] args)
	{
		Utility u=new Utility();
	
		
		//accept the string
		System.out.println("Enter a String");
		String str=u.inputString();
		//calll method
		PalindromeMethod.palindromeMethod(str);
	}

}
