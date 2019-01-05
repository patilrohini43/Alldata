package all.program.utility;

import all.algo.program.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	
	BufferedReader br;


	
	  public Utility()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	
		
		}
	  

	//take input word
		public String inputString(){
			try{
				return br.readLine();
			}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return "";
	}
		
		  
		  
		  
      //take the input for number
		  public int inputInteger(){
				try{
					try{	
						return Integer.parseInt(br.readLine());
					}
					catch(NumberFormatException n){
						System.out.println(n.getMessage());	
					}
				}catch(IOException io){
					System.out.println(io.getMessage());
				}
		return 0;
			
		  }

		  
		  
		  public Double inputDouble() {
				// TODO Auto-generated method stub
				try{
					try{	
						return Double.parseDouble(br.readLine());
					}
					catch(NumberFormatException n){
						System.out.println(n.getMessage());	
					}
				}catch(IOException io){
					System.out.println(io.getMessage());
				}
		        return (double) 0;
				
			
			}
			
		  //check the string is anagram or not
		  
		  public static void isAnagram(String input1, String input2){
		        //Remove all whitespace first
		        String  s1= input1.replaceAll("\\s", "");
		 
		        String s2 = input2.replaceAll("\\s", "");
		        
		        boolean status = true;
		 
		        if(s1.length() != s2.length())
		        {
		            status = false;
		        }else {
		            //Convert into character array
		 
		            char[] s1Array = s1.toLowerCase().toCharArray();
		 
		            char[] s2Array = s2.toLowerCase().toCharArray();
		 
		            //Sorting both character array
		 
		            Arrays.sort(s1Array);
		 
		            Arrays.sort(s2Array);
		 
		            //Check if both arrays are equal
		 
		            status = Arrays.equals(s1Array, s2Array);
		        }
		        
				if(status){
		            System.out.println(s1+" and "+s2+" are anagrams");
		        } else {
		            System.out.println(s1+" and "+s2+" are not anagrams");
		        }

		  }
			
		  
		  
		  
		  
		//The  numbers are anagram or not
		  public static boolean anagram(int n1,int n2)
		  {
			  int[] ncount1=count(n1);
			  int[] ncount2=count(n2);
			  for(int i=0;i < ncount2.length;i++)
			  {
				  if(ncount1[i]!=ncount2[i])
				  {
					  return false;
				  }
			  }
			return true;
			  
					  
		  }
		  
		  
	
		  
 // count the anragram numbers
		  
		  private static int[] count(int n){
			// TODO Auto-generated method stub
			  int[] count=new int[20];
			  int temp = n;
				while (temp != 0) {
					int r = temp % 10;
					count[r]++;
					temp = temp / 10;
				}
		return count;
			  
		  }
		  
		  
		  //the Prime Anagarm
		  public static void primeAnagram()
		  {
			  ArrayList<Integer> ar = new ArrayList<Integer>();
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b)
			
					ar.add(j);
				  
					  
			  }
			  
			  for(int i=0;i<=ar.size();i++)
			  {
				  for(int j = i+1;j < ar.size();j++)
				  {
					  if(anagram(ar.get(i),ar.get(j)))
					  {
						  System.out.println("prime number"+ar.get(i)+"Anagram"+ar.get(j));
					  }
				  }
			  }
			  
			
		  }




		//display the number between 1 to 1000
		  public static void prime() {
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b)
			
					  System.out.println(j + " ");
				  
					  
			  }
			  
			  
			  
		  }
		  
		 
		  
	
		  
		 
		 //Check the prime number between 1 to 1000
		  public static boolean isPrime(int n) {
				for (int i = 2; i < n / 2; i++) {
					if (i % n == 0) {
						return false;
					}
				}
				return true;
		}
		  
		  
		  
		  //this method for display the palindrome 
		  public static void palindrome()
		  {
			  
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b && isPalindrome(j))
			
					  System.out.println(j + " ");
				  
					  
			  }
			  
			  
		  }
		  
		  
		  //check the palindrome number 1 t0 1000
		  public static boolean isPalindrome(int num)
		    {
		        int rev=0,temp=num;
		        for (int i = 1; i <= num; i++)
		        {
		        while(temp!=0)
		        {
		            rev=rev*10+(temp%10);
		            temp=temp/10;
		        }
		        }
		        if(rev==num)
		            return true;
		        else
		            return false;
		    }

			
		  
		  //BubbleSort Elements
		  public static void BubbleSort(int arr[])
		  {
			  int temp;
			  int num=arr.length;
			  for(int i=0;i<num-1;i++)
			  {
				  
				  for(int j=0;j<num-i-1;j++)
			  {
					  if(arr[j]>arr[j+1])
					  {
						  temp=arr[j];
						  arr[j]=arr[j+1];
						  arr[j+1]=temp;
					  }
				  }
			  }	
			  
		  }
		  //print the list od sorted
		  public static void printList(int arr[])
		  {
			  int num=arr.length;
			  
		     System.out.println("Sorted list of numbers:");
			  
			    for(int i=0;i<num;i++)
			    {
			    	 System.out.println(arr[i]);
			    }
			     
			  
		  }
       
         //questionProgram method fo binary search
		public int binarySearch(int low,int high) {
			
			// TODO Auto-generated method stub
			   if ((high - low) == 1)
			   {
				   return low;
			   }
          
		        int mid = low + (high - low) / 2;
		        
		        System.out.println("number is less than "+ mid +"press 1 to Yes or press 0 to No");
		        Scanner sc=new Scanner(System.in);
		        
		        int no=sc.nextInt();
		        if(no==1)
		        {
		        	return binarySearch(low,mid);
		        }
		        else
		        {
		        	return binarySearch(mid,high);
		        }
		        
		}
		
		
		//defining the method of calculator for Vending machine
		static int i=0;
		public static int total=0;
		public static int cal(int money,int[]notes) {
		    int rem;
		    if (money==0) {
		        return -1;
		    }
		    else {
		    	//check the money value
		        if (money>=notes[i]) {
		            int countnotes=money/notes[i];
		            rem=money % notes[i];
		            money=rem;
		            total+=countnotes;
		            System.out.println(countnotes+" Notes of  "+notes[i]);//count the total number of notes
		          
		        }i++;
		        return cal(money,notes);   //return notes
		      
		      
		    }
		  
		}
		
		/**
		 * 
		 * @param d is given for date
		 * @param m is given for month 
		 * @param y is given for year
		 * @return day of the week from 1 to 7
		 */
		//date function use this formula to calculate d,m,y
		public static int date(int d,int m,int y)
		{
			
				int y0 = ((y - (14 - m) / 12));
				int x = (y0 + y0 / 4 - y0 / 100 + y0 / 400);
				int m0 = (m + 12 * ((14 - m) / 12) - 2);
				int d0 = (((d + x + (31 * m0) / 12) % 7));
		        return d0;
		        
		}
	
		/**
		 * 
		 * @param given the fahrenheit
		 * @return converion in temperature
		 */
		
		//calculate the Fahrenheit  temperature to Celsius
		public static float tempConverSion(int fahrenheit)
		{
			float cel=((fahrenheit- 32) * 5/9) ;
			return cel;
			
		}
		
		
		/**
		 * 
		 * @param p for principal amount
		 * @param r for rate
		 * @param y for year
		 * @return calculate the monthly payment 
		 */
		
		public static double monthPayment(double p,double r,double y)
		{
			
			double n = 12 * y;
			double r0 = r / (12 * 100);
			double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
	        return payment;
			
		}
		
		/**
		 * 
		 * @param c nonnegative number c given
		 * @return the estimate of the square root of c
		 */
		public static double newTon(double c)
		{
			double epsilon = 1e-15; 
			double t=epsilon;
			
			// repeatedly apply Newton update step until desired precision is achieved
			while (Math.abs(t - c/t) > epsilon*t) 
			{
	            t = (c/t + t) / 2.0;
	        }
			 // the estimate of the square root of c
			return t;
			
		}
		
		
		/**
		 *  we convert the given decimal input into a binary number with
		 *  the help of division and modulus 
		 * operations along with loops and if conditions to get the desired output.
		 * @param n given decimal number
		 * @return x is return the binary number 
		 */
		
       public static String decimalTobinary(int n)
       {
    	
		String x=" ";
	
		int count=0;
    	   
           while(n > 0)

           {

            int a = n % 2;

               if(a == 1)

               {

                   count++;

               }

               x = x + "" + a;

               n = n / 2;
               
               System.out.println("The power of 2^"+n);
             

           }
		return x;
		
    	   
       }
       

       /**
        * 
        * @param n take the value from user side n
        * @return the binary number which converted into int
        */
      public  static int[] toBinary(int n) {

   		String x= "";
   		while (n != 0) {
   		x = (n % 2) + x;
   			n/= 2;
   		}
   
   		return stringToIntArray(x);
   }
       
      
   /** This Function is used for convert the String to Int
    * 
    * @param this x is declared as string but use this function to convert String to int
    * @return they retrun int array value
    */
    public  static int[] stringToIntArray(String x) {
   		int[] b = new int[x.length()];
   		for (int i = 0; i < b.length; i++) {
   			b[i] = x.charAt(i) - 48;
   			//stem.out.println(b);
   			
   		}
   		return b;
   		}
    
   
       
    
       //swap the decimal number
    /**
     * 
     * @param arr is used for swap the array
     * @return swapped array
     */
       public static int[] swap(int[] arr)
       
       {
    	   int temp,j=arr.length-4;
    	   for(int i=0;i<4;i++)
    	   {
    		   temp=arr[i];
    		   arr[i]=arr[j];
    		   arr[j]=temp;
    		   j++;
    		   
    	   }
		return arr;
    	   
       }
       
       
    /**
     * 
     * @param arr print the array 
     */
   public static void showArr(int[] arr) {
   		// System.out.println("array is ");
   		for (int i = 0; i < arr.length; i++) {
   			System.out.print(arr[i]);
   		}
   		System.out.println();
   	}

   
   /**
    *  
    * @param binary to binary array converted
    * @return decimal value 
    */
  public static int todecimal(int[] b)
  {
	  int dec = 0, j = 0;
	for (int i = b.length - 1; i >= 0; i--) {    
		if (b[i] == 1) {
			dec = dec + (int) Math.pow(2, j);   //use math function for power of value
		}
		
		j++;
	}
	return dec;
}

  

       
}

			

