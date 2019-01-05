/*
* Created by:Rohini Patil
* Date 21/12/2018
* Purpose:Question to find your number

**/


package all.algo.program;

import all.program.utility.Utility;

public class QuestionNumber {
	public static void main(String args[])
	{
		Utility u=new Utility();
		int low = 0,mid=0;
		System.out.println("Enter the number u want");
	    int num=u.inputInteger();
		int high= (int) Math.pow(2, num);
	   System.out.println("Think number number between "+ low + "to" + high + "in range");
       
	   //call binarySearch Method here
        int number=u.binarySearch(low,high);
        
        System.out.println("Your Number is"+number);
       
	}

}
