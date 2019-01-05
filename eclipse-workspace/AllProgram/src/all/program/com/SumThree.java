/*
* Created by: BridgeLabz
* Date 16/12/2018
* Purpose:A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
**/

package all.program.com;


import java.util.*;

import all.program.utility.Utility; 
  
public class SumThree{ 
  
    
   
    public static void  main(String[] args) 
    { 
    	Utility u=new Utility();
    	
    	System.out.println("Enter the value you want");
    	int n=u.inputInteger();
    	int []b=new int[20]; //create the array 
    	System.out.println("Enter value");
    	for(int i=0;i<n;i++)
    	{
    	 b[i]=u.inputInteger();   //read the value of one by one
    	}

        System.out.println("Enter the Sum");
        int sum = u.inputInteger(); //assign the sum value
        
          
        List<List<Integer> > triplets = u.findTriplets(b, sum); 
  
        
         // checking the number is found or not 
         
        if (!triplets.isEmpty()) { 
            System.out.println("triplets:-"+sum); 
        } else { 
            System.out.println("No triplets can be formed"); 
        } 
    } 
} 
