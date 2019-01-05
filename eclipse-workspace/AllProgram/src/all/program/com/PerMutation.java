/*
* Created by:Rohini Patil
* Date 18/12/2018
* Purpose:Write static functions to return all permutation of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.
**/

package all.program.com;

import all.program.utility.*;

import all.program.utility.Utility;

public class PerMutation {


 
    public static void main(String[] args) {
   	        Utility u=new Utility();
    	//get the string from user
    	System.out.println("Enter the String You Want:-");
    	String str=u.inputString();    
    	int n=str.length();
   
		//call permutation method 
        u.permute(str, 0, n-1);
       // System.out.println("\n Permutations for " + str + " are: \n" +u.permutationFinder(str));
       
    }
}
