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
	
		//create the object of palindome 
		PalindromeLogic<Integer> list=new PalindromeLogic<>();
		
		System.out.println("Enter a String");
		String str=u.inputString();
		for(int i=0;i<str.length();i++)
		{
			int c=str.charAt(i);
			list.addRear(c);
		
		}

        boolean isPalindrome=true;
       // int first=list.dequeue();
         //int last=list.dequeueLast();
        
        while (list.size()>1) {
          { 
    	if(list.removeFront()==list.removeRear())
    	{
    		   // System.out.println(list.removeFront());
                continue;
            } else {
            	
            	  //System.out.println(list.removeRear());
                isPalindrome=false;
                break;
            }
        }
       
        }
        
        if (!isPalindrome) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }
	}

}
