/*
* Created by:Rohini Patil
* Date 15/12/2018
* Purpose:find the roots of the equation a*x*x + b*x + c.

**/
package all.program.com;

import all.program.utility.*;;
public class SumOfThree
{
	

	public static void main(String[] args)
	{
		Utility u=new Utility();
		System.out.println();

		
		System.out.print("Enter Size of Array :");
		int size=u.inputInteger();
		int arr[]=new int [size];//create array & read values one by one

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=u.inputInteger();
		}


		int sum=u.findDistinctTriplets(arr,size);
		System.out.println("No.of Tripltes :"+sum);
		System.out.println();
	}
}