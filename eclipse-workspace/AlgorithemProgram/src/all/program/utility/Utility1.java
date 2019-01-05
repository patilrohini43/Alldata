package all.program.utility;

import all.program.utility.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility1 {
	
	private static int j;
	BufferedReader br;
	Utility u=new Utility();
	private int key;
	
	  public Utility1()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	
		
		}
	 
	//take input for string
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
	  
	  
	/*
		public int[] input1DArray(int arraySize) {
		
		 System.out.println("Enter The Number  of Elements to be Sort");
	        int num=u.inputInteger();
	        int arr[]=new int[num];
	        System.out.println("Enter Numbers");
	         for(int i=0;i<num;i++)
	        	 arr[i]=u.inputInteger();
			return arr;
		}
	  
  
		public String[] input2DArray(int arraySize) {
			
			 System.out.println("Enter The Number  of Elements to be Sort");
		        String str=u.inputString();
		        String arr[]=new String[arraySize];
		        System.out.println("Enter Numbers;");
		         for(int i=0;i<arraySize;i++)
		        	 arr[i]=u.inputString();
				return arr;
			}
		  
		*/
	  
	  
	//Take 1st Array Input
		public int[] firstArray(int arrSize){
			int arr[]=new int[arrSize];
			for(int i=0;i<arrSize;i++){
				System.out.println("Enter array["+i+"] : ");
				arr[i]=u.inputInteger();
			}
			return arr;
		}

		//Take 2n array String Array Input
		public String[] secondArray(int arrSize){
			String arr[]=new String[arrSize];
			for(int i=0;i<arrSize;i++){
				System.out.println("Enter array["+i+"] : ");
				arr[i]=u.inputString();
			}
			return arr;
		}

		//Print 1D array
		public void printIntArray(int array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
		
		//print 1D array String
		public void prinStringArray(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}

		

		  //BubbleSort Elements for Numbers
		  public int[] BubbleSort(int arr[])
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
			  return arr;
		  }

		  
		  
		  
	   //

		  //BubbleSort Elements for String
		  public void BubbleSortString(String arr1[])
		  {
			  String temp;
			  int num1=arr1.length;
			  for(int i=0;i<num1-1;i++)
			  {
				  
				  for(int j=0;j<num1-i-1;j++)
			  {
					  if(arr1[j].compareTo(arr1[j+1])>0)
					  {
						  temp=arr1[j];
						  arr1[j]=arr1[j+1];
						  arr1[j+1]=temp;
					  }
				  }
			  }	
			 
		  }
		  
		  //binary search methods
		  public int binarySearch(int[] arr, int size,int search) {
			    int start = 0;
			    int end = size - 1;

			    while (start <= end) {
			        int mid = (start + end) / 2;
			        if (arr[mid] == search) {
			            return mid;
			        } else if (arr[mid] < search) {
			            end = mid - 1;

			        } else {
			            start = mid + 1;
			        }
			    }

			    return -1;

			}

			
			//Binary Search for String
			public int binarySearchString(String[] names, String key) {
		        int first = 0;
		        int last = names.length;
		        while (first<= last) {
		            int mid = (first + last) / 2;
		            if (key.compareTo(names[mid])<0) {
		            	last = mid;
		            }
		            if (key.compareTo(names[mid])>0){
		            	first = mid + 1;
		            } else {
		            	return mid;
		            }
		        }
		        return -1;
		}
			
			
			//insertion sort for Integer Numbers:
			public int[] insertionSort(int arr[]) 
		    { 
		        int n = arr.length;
		        for (int i=1; i<n; ++i) 
		        { 
		            int key = arr[i]; 
		            int j = i-1; 
		  
		            
		            while (j>=0 && arr[j] > key) 
		            { 
		                arr[j+1] = arr[j]; 
		                j = j-1; 
		            } 
		            arr[j+1] = key;
		        }
				return arr;
				
			}
			
			
			
			
			/* Function to sort an array using insertion sort*/
			/**
			 * 
			 * @param arr sort an arr[] of size num
			 * insertionSort(arr,n)]
			 * loop from i=1 to n-1
			 * pick the element arr[i] and sorted into i-1
			 * @param num
			 */
			public void insertionSort(String arr[], int num) 
			{ 
			   int i, j;
			String key; 
			   for (i = 1; i < num; i++) 
			   { 
			       key = arr[i]; 
			       j = i-1; 
			  
			       while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0)
			       { 
			           arr[j+1] = arr[j]; 
			           j = j-1; 
			       } 
			       arr[j+1] = key; 
			   } 
			} 
			  
			
			
			//merge Sort Elements
			public void sort(String arr[],int l,int r)
			
			{
				if(l<r)     //  recursion call tills l<r
				{    
					//find the midPoint
					int m=(l+r)/2;
					//System.out.println(m);
					//sort the first and second value
					sort(arr,l,m);       //  recursion call tills l<r
					sort(arr,m+1,r);
				
					//merge sort
				
					merge(arr,l,m,r);
					
					
				}
				
			}
/** Sort the String using merge
 * 
 * @param merge the subarrays of arr
 * @param l left of array
 * @param m middle
 * @param r right of array
 */
			public static void merge(String arr[], int l, int m, int r) {
				// TODO Auto-generated method stub
				
				int n1 = m - l + 1;
                int n2 = r - m;

                String L[] = new String[n1];    //create temp arrays
                String R[] = new String[n2];

                for (int i=0; i<n1; ++i)
                    L[i] = arr[l + i];
                for (int j=0; j<n2; ++j)
                    R[j] = arr[m + 1+ j];
				
				//copy data to temp array
				
				 int i = 0, j = 0; 
				  
			        // Initial index of merged subarry array 
			        int k = l; 
			        while (i < n1 && j < n2) 
			        { 
			           			       
	
			        	int comp=L[i].compareTo(R[j]);        
			        	
					if(comp<0)
			            { 
			                arr[k] = L[i];       //compare thr elements of  two subarrays and merge them
			                i++; 
			            } 
			            else
			            { 
			                arr[k] = R[j]; 
			                j++; 
			            } 
			            k++; 
			        } 
			  
			        //Copy remaining elements of L[] if any 
			        while (i < n1) 
			        { 
			            arr[k] = L[i]; 
			            i++; 
			            k++; 
			        } 
			  
			        // Copy remaining elements of R[] if any 
			        while (j < n2) 
			        { 
			            arr[k] = R[j]; 
			            j++; 
			            k++; 
			        } 
			    }

			
			
			
}
