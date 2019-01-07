/**Created by:Rohini Patil
* Date 4/01/2019
* Purpose:Desc ­> :the Prime Number Program and store only the numbers in that range that are
Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
Further store in a 2D Array the numbers that are Anagram and numbers that are not
Anagram
 */

package all.program.data;

import java.util.ArrayList;

import all.program.utility.Utility;

public class PrimeAnagram2D {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

           Utility u=new Utility();
           String string1 = "";
           String string2 = "";
           int count = 0;
           //accept the number from user
          System.out.println("Enter the range of the prime number");
          int number =u.inputInteger();
          //create arraylist and store the prime number in array
          ArrayList<Integer> prime = u.prime(number);
          int row = prime.size(); //calculate size
          String anagram[][] = new String[row][2];
          
          System.out.println("\nPrime numbers that are Anagram\n");
          for(int i=0; i<prime.size(); i++)
          {
	          for(int j=i+1; j<prime.size(); j++) 
	          {
		         string1 = Integer.toString(prime.get(i));    //string value convert to Integer and 
		         string2 = Integer.toString(prime.get(j));
	               	if(u.isAnagram(string1, string2))   //check the string is equal or not
	             	{
			            	anagram[count][0] = string1;
				           anagram[count][1] = string2;
			              	count++;
		            }
	            }              
          } 
         for(int i=0; i<count; i++) 
         {
	          for(int j=0; j<anagram[0].length; j++)
	          {
	            	System.out.printf(anagram[i][j]+" ");              //display values
	          }
	System.out.println();
}
}
}