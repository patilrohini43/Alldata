/*
6
* Created by:Rohini Patil
* Date 20/12/2018
* Purpose:Reads in strings from standard input and prints them in sorted order.
Uses insertion sort

**/


package all.algo.program;

import java.util.Arrays;

import all.program.utility.Utility1;

public class InsertionSortString {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	    Utility1 u=new Utility1();
		System.out.println("Enter number of words  You Want");
		int num=u.inputInteger();
		
		
		 
		//create string array
		String[] arr=new String[num];
		//accept the value from user using array
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter array["+i+"] : ");
			arr[i]=u.inputString();
		}
	       
		
		//display the given array
				System.out.println("Given array:-");
				 num=arr.length;
			        for (int i=0; i<num;++i)
		              System.out.print(arr[i] + " ");
			        
			     
			        //call insertionSort String Method
			      u.insertionSort(arr,num);
			    	//display the sorted aaray
			    		System.out.println("\nSorted array");
			    		num = arr.length;
			    	        for (int i=0; i<num;++i)
			    	               System.out.print(arr[i] + " ");

}
	

}
