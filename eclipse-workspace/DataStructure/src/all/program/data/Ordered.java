/*
* Created by:Rohini Patil
* Date 31/12/2018
* Purpose:Read .a List of Numbers from a file and arrange it ascending Order in a
Linked List. Take user input for a number, if found then pop the number out of the
list else insert the number in appropriate position
**/

package all.program.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ordered {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		File file=new File("/home/admin1/eclipse-workspace/DataStructure/ordered.txt");
		
	     BufferedReader br = new BufferedReader(new FileReader(file));
	     String s="";
	     while((s = br.readLine()) != null)
	 	{
	 		System.out.println(s);
	 		String arr[] = s.split(" ");
	 		int arr2[] = new int[arr.length];
	 		for(int i =0; i<arr.length;i++)
	 		{
	 			arr2[i] = Integer.parseInt(arr[i]);
	 		}
	 		operation(arr2);
	 	
	 	}
	    
		
	 	
		
	}
		public static void operation(int[] arr) throws Exception
		{
	    for(int i = 0 ; i< arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
		UnLinked<Integer> list = new UnLinked<>();
		
		for(int i =0; i < arr.length ;i++ )
		{
			
			list.add(arr[i]);
		}
			
			//System.out.println(arr[i]);
		
		//System.out.println(list.length());
		
		list.show();

		System.out.println("\n Enter Search Number");
		Scanner sc = new Scanner(System.in);
        int search=sc.nextInt();
	   if(list.search(search))
	   {
		   list.pop(search);
	   }
	   else
	   {
		   list.add(search);
	   }
	   
		
		list.show();
		

		}	 

	}




