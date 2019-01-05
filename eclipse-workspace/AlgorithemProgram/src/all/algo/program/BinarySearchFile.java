package all.algo.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import all.program.utility.Utility1;

public class BinarySearchFile {
	   public static void main(String[] args) throws IOException {
	       
		   Utility1 u=new Utility1();
		   //create file object and calling path
	            File file =new File("/home/admin1/data/myfile");
	            String names[] = null;
	            Scanner sc =new Scanner(System.in);
	              String line = null;
	              //create BufferReadered object and assign the path
	             BufferedReader br = new BufferedReader(new FileReader(file));
	             while ((line = br.readLine()) != null) {
	            	 names = line.split(" ");
	           }
	                br.close();
	               
	                //search key 
	        System.out.println("Entre key for search:");
	        String key=sc.nextLine();
	        //call binarySearch string method
	        int res=u.binarySearchString(names, key);
	        if(res==-1)
	       {
	           System.out.println("Not Exist...");
	       }
	       else
	       {
	           System.out.println("Found at position: "+res);
	       }
	      
	      }
	    

}
