/*
* Created by:Rohini Patil
* Date 20/12/2018
* Purpose:Reads in integers prints them in sorted order using Bubble Sort
**/
package all.algo.program;

import all.program.utility.*;

public class BubbleSort {
	public static void main(String args[])
	{
		int i,j;
		 BubbleSort ob = new BubbleSort();
		 Utility u= new Utility();
		 //entering the value from user 
        System.out.println("Enter The Number  of Elements to be Sort");
        int num=u.inputInteger();
        //create array
        int arr[]=new int[num];
        System.out.println("Enter Numbers");
         for(i=0;i<num;i++)
        	 arr[i]=u.inputInteger();
         System.out.println("Sorted Elements");
         //call bubbleSort Method
         u.BubbleSort(arr);
         //call printList Method
         u.printList(arr);
        
	}

}
