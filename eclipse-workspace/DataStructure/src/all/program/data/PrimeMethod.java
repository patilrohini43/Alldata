package all.program.data;

import java.util.ArrayList;

import all.program.utility.Utility;

public class PrimeMethod {
	
	static PrimeMethod p=new PrimeMethod();
	Utility u=new Utility();
	  
	 public  boolean isPrime(int n) // Function for checking whether a number is prime or not
	   {
	       int c = 0;
	       
	       for(int i = 1; i<=n; i++)
	       {
	           if(n%i == 0)
	               c++;
	       }
	       if(c == 2)
	       
	          return true;
	       else
	        return false;
		
	   }
	  
	  
	  public static void primMethods(int m,int n)
	  {
		  
		//  String Range[]= {"0-100","101-200","201-300","301-400","401-500"};
	      
		  int A[][]=new int[m][n]; // 2D array for storing 'm*n' prime numbers
	      int B[] = new int [m*n]; // 1D array for storing 'm*n' prime numbers
	      
	      
	      int i = 0, j;
	      int k = 1; // For generating natural numbers
	       
	      /* First saving the 'm*n' prime numbers into a 1D Array */
	      while(i < m*n)
	      {
	         if(p.isPrime(k)==true)
	          {
	                  B[i] = k;
	                 // System.out.println("  hii "+B[i]);
	                  i++;
	                
	                  
	          }
	          k++;
	        // System.out.println("  hii "+k++);
	      }
	      
	     
	      
	      /* Saving the 'm*n' prime numbers from 1D array into the 2D Array */
	  int x = 0;
	      for(i=0; i<m; i++)
	       {
	          for(j=0; j<n; j++)
	          {
	              A[i][j] = B[x];
	              x++;
	          }
	       }
	      
	      
	      
	      /* Printing the resultant 2D array */
	      System.out.println("The Filled Array is 0 to 100  :");
	      for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	               {
	                   System.out.print(A[i][j]+"\t");
	               }
	           System.out.println();
	       }
	  }
	 
	
/************************************************************************************************************/
	  
	  
	  

		

	   
	   
		  
	  
}

