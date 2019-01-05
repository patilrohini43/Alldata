/*
* Created by:Rohini Patil
* Date 20/12/2018
* Purpose:Search and Sorted List, More importantly print elapsed time
performance in descending order

**/

package all.algo.program;

import java.util.Arrays;

import all.program.utility.Utility1;

public class SortingProgram {
	
	public static long start=0;
	public static long end=0;
	public static long elapsed=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Utility1 u=new Utility1();
		
	
			System.out.println("--------Options for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice=u.inputInteger();
			System.out.println();
	 
             switch (choice) {
             case 1:

					start=System.currentTimeMillis();
					System.out.println("BinarySearch Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize=u.inputInteger();
					int[]arr3=u.firstArray(arrSize);
					int size = arr3.length;
				
					System.out.println("Enter Key:");
					int search=u.inputInteger();
				    int k = u.binarySearch(arr3, size,search);

					if(k==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+k+" psition");
}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;
            	 
             
                
             case 2:
            	 start=System.currentTimeMillis();
					System.out.println("BinarySearch String");
					System.out.println("Enter size of Elements");
			 		int arrSize1=u.inputInteger();
			        String e2[]=u.secondArray(arrSize1);
					Arrays.sort(e2);
					//u.firstArray(arrSize1);
					
				
					System.out.println("Enter Key: ");
					int k1=u.binarySearchString(e2,u.inputString());
				
					//System.out.println("Sorted Array is: ");

					if(k1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+k1+"position");
}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
              break;
         	 
                 
              
             case 3:
            	 start=System.currentTimeMillis();
					System.out.println("InsertationSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize11=u.inputInteger();
					int e1[]=u.firstArray(arrSize11);
					u.printIntArray(e1);
				
				
					int k3[]=u.insertionSort(e1);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k3.length;i++)
					{
						System.out.println(k3[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;

             case 4:	
                 start=System.currentTimeMillis();
					System.out.println("InsertationSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
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
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
              break;
                 
             case 5:
            	 

					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize5=u.inputInteger();
					int e5[]=u.firstArray(arrSize5);
					u.printIntArray(e5);
				
					System.out.println("Enter Key: ");
					int k11[]=u.BubbleSort(e5);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k11.length;i++)
					{
						System.out.println(k11[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                    break;
                    
             case 6:
            	 

					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For String");
					System.out.println("Enter size of Elements");
					int num1=u.inputInteger();
					String[] arr1=new String[num1];
					//accept the value from user using array
					for(int i=0;i<num1;i++)
					{
						System.out.println("Enter array["+i+"] : ");
						arr1[i]=u.inputString();
					}

					//display the given array
							System.out.println("Given array:-");
							 num1=arr1.length;
						        for (int i=0; i<num1;++i)
					              System.out.print(arr1[i] + " ");
						        
						      u.BubbleSortString(arr1);
						        
						      //display the sorted aaray
					    		System.out.println("\nSorted array");
					    		num1 = arr1.length;
					    	        for (int i=0; i<num1;++i)
					    	               System.out.print(arr1[i] + " ");
						        
					
					/**
					int arraySize1=u.inputInteger();
					String s[]=u.secondArray(arraySize1);
                    u.prinStringArray(s);
				
					System.out.println("Enter Key: ");
					String[] k111=u.BubbleSortString(s);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k111.length;i++)
					{
						System.out.println(k111[i]);
					}
					**
					*/
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;
            	 
             

			default:
					System.out.println("Wrong");

             
             }
		
		
	}

}
