/**Created by:Rohini Patil
* Date 4/01/2019
* Purpose:Desc ­> :Add the Prime Numbers that are Anagram in the Range of 0 ­ 1000 in a Queue using
the Linked List and Print the Anagrams from the Queue. Note no Collection Library
can be used.
 */

package all.program.data;

import java.util.ArrayList;

import all.program.utility.Utility;

public class PrimeAnagramUsingQueue {

	public static class AnagramPrime {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//
			LinkListQueue<String> queue=new LinkListQueue();
			
			 StackList<String> stack=new  StackList();
			Utility u=new Utility();
			int count=0;
			String string1="";
			String string2="";
			
			//accept the input from user
			System.out.println(" the range of prime numbers");
			int number=u.inputInteger();
			ArrayList<Integer> prime=Utility.prime(number);
		   //System.out.println(prime);
			System.out.println("Prime numbers are anragram");
			 
			 for(int i=0;i<=prime.size();i++)
			  {
				  for(int j = i+1;j < prime.size();j++)
				  {
					string1=Integer.toString(prime.get(i));
					string2=Integer.toString(prime.get(j));
					//check string equal or not
					  if(u.isAnagram(string1,string2))
					  {
						  //add the value using queue
				       System.out.println(queue.enqueue(string1+"  "+string2));
				        count++;
				  
					  }
				  }
				
			  }
			 
			  for(int i=1;i<=count;i++)
				{
				  //delete the value from queue 
					System.out.println(queue.dequeue());
				}
		}
	}
		
	}
	

