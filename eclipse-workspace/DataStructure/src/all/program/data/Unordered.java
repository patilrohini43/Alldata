/*
* Created by:Rohini Patil
* Date 28/12/2018
* Purpose:Read the Text from a file, split it into words and arrange it as Linked List.
Take a user input to search a Word in the List. If the Word is not found then add it
to the list, and if it found then remove the word from the List. In the end save the
list into a file
**/

package all.program.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import all.program.utility.Utility;

public class Unordered {
	
	public static void main(String args []) throws Exception
	{
		
		
    Linked<String> list = new Linked<>();
		
   try
   {
	File file=new File("/home/admin1/data/data1");
	
     BufferedReader br = new BufferedReader(new FileReader(file));
     String s="";
     while((s = br.readLine()) != null)
 	{
 		System.out.println(s);
 		String str[] = s.split(" ");
 		operation(str);
 	}
    
     
     FileWriter fw=new FileWriter("/home/admin1/data/data1");
 	BufferedWriter bf=new BufferedWriter(fw);
 	for(int i=0;i<list.length();i++)
 	{
 		fw.write(list.get(i));
 	}
   }
   catch(Exception e)
   {
	   System.out.println("File Not Found");
   }

	}
	public static void operation(String str[]) throws Exception
	 
	{
		Utility u=new Utility();
    
	Linked<String> list = new Linked<>();
	

	
	for(int i = 0; i < str.length ;i++ )
	{
		
		list.insert(str[i]);
		
		System.out.println(str[i]);
	}
	//System.out.println(list.length());
	
	list.show();

	
	//accept the search element
	System.out.println("\n Enter Search String");
    String search=u.inputString();
    
	int position = list.index(search);
	//if position equal then insert search key otherwise delete
	if(position == 0)
	{
		
		list.insert(search);
	}
	
	else
	{
		
		
		list.delete(search);
	}
	list.show();        //display value
	
	
	
	
	}
}
	