

/*
* Created by:Rohini Patil
* Date 19/12/2018
* Purpose:1.One string is an anagram of another if the second is simply a
           rearrangement of the first.
          2.Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that range.
          3.find the prime numbers that are Anagram and Palindrome
**/
package all.algo.program;

import java.util.Arrays;

import all.program.utility.Utility;
public class Anagrams {

	
	
	public static void main(String[] args) {
		
		//Creating the object of Utility for calling function
		Utility u=new Utility();
		//Entering the value from user Str1 and str2
		System.out.println("Enter the first String");
		String str1=u.inputString();
		
		System.out.println("Enter the first String");
		String str2=u.inputString();
		u.isAnagram(str1, str2);
		
	    //display prime number	
		System.out.println("the 1 to 1000 between Prime Number ");
		//call method of prime
		u.prime();
		//display prime palindrome method
		System.out.println("the 1 to 1000 between Prime palindrome number ");
		//call method palindrome
       u.palindrome();
       //display the number are prime n anagram
       System.out.println("The numbers are Prime and Anargram");
       //call method primeAnargram 
       u.primeAnagram();
       
		
	}

}
