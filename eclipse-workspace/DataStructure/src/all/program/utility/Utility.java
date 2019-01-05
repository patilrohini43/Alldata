package all.program.utility;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import all.program.data.Linked;
import all.program.data.UnLinked;

public class Utility {
	
	
	
	
	
	
	
	

	BufferedReader br;


	
	  public Utility()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	
		
		}
	  
	  
	  
	  
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
	  
	//this function take two parameter 
		// 1 what data to write.
		// 2 file name
		public void writeToFile(String data,String fileName)throws Exception{
			File file = new File("/home/admin1/eclipse-workspace/DataStructure/linkedlist.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file); 
	       // Writes the content to the file
	       writer.write(data); 
	       writer.flush();
	       writer.close();
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
				
				public static boolean isAnagram(String string1, String string2) {
					
					//compare the length of two strings is equal or not
					if(string1.length()!=string2.length())
						return false;
					
					//call count method and pass first string
					int count1[] = count(string1);
					
					//call count method and pass second string
					int count2[] = count(string2);
					
					//check the value of the two strings are equal or not
					for(int i=0; i<count1.length; i++) {
						if(count1[i] != count2[i])
							return false;
					}
					return true;
				}
				
				/**
				* Purpose: This method is used to count the alphabets present in the string and increment the index of the count array.
				* @param string 
				* @return integer one dimensional array
				*/
				public static int[] count(String string) {
					
					//Convert String to character array
					char c[] = string.toCharArray();
					
					//Define a count array and the size of the array is 36
					int count[] = new int[36];
					
					//using loop 0 to size of the character array
					for(int i=0; i<c.length; i++) {
						
						//if character array is small alphabet
						if(c[i]>='a' && c[i]<='z')
							
							//small alphabet covert into the integer and increment the count array
							count[c[i]-97]++;
						
						//if character array is capital alphabet
						if(c[i]>='A' && c[i]<='Z')
							
							//capital alphabet convert into the integer and increment the count array
							count[c[i]-65]++;
						
						//if character array is digit between 0 to 9
						if(c[i]>='0' && c[i]<='9')
							
							//digit convert into the integer and increment the count array
							count[c[i]-22]++;
					}
					
					//return count array
					return count;
				}
				  
				  
				



				  public static ArrayList<Integer> prime(int number) {
						ArrayList<Integer> prime = new ArrayList<Integer>();
						
						//This for loop is starts from 2 and iterate n times
						for(int i=2; i<=number; i++) {
							int c = 0;
							
							//This for loop is starts from 2 and iterate half of the value of the first loop
							for(int j=2; j<=i/2; j++) {
								
								/*If the reminder of the first loop value and the second loop value is 0
								  then the value of the c is equal to 1 and break the inner loop*/
								if(i % j == 0) {
									c = 1;
									break;
								}
							}
							
							//if c is equal to 0 its mean the value of i is prime number and print the value of i
							if(c == 0)
								prime.add(i);
						}
						return prime;
					}
				  

				 
				 
				  //This function used for hashing
				  public static void hashing()
					 {
						 //declare the array
						 Integer array[] = {33,44,55,64,34,23,22,121,11,21,14};
						 
						 //create object of  unlinked 
						 UnLinked<Integer> arr[] = new UnLinked[array.length];
						
						
						 int index=0;
					      for(int i=0;i<arr.length;i++)
							{
								arr[i]=new  UnLinked<Integer>();
							}
					     
					      for(int i=0;i<arr.length;i++)
					      {
					    	  //the reminder of array value store in index
					    	  index = array[i]%array.length;
					    	  //add the one by one element in index 
					    	  arr[index].add(array[i]);
					      }
					      
					      for(int i=0;i<arr.length;i++)
							{
					    	  System.out.print(i+"");
								for(int j=0;j<arr[i].size();j++)
								{   System.out.print("--->");
								
								//get the element at position of index
									System.out.print(arr[i].get(j+1)+" ");
								}
								System.out.println();
							}
					    
					      
					}
						 

				  
/////////////////////////////////////////////////////////////////////////////////////////////////////////
				  
				  
  
				
}
