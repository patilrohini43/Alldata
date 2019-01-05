/*
* Created by:Rohini Patil
* Date 15/12/2018
* Purpose:A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
**/

package all.program.com;

import java.io.PrintWriter;

import all.program.utility.Utility;

public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Utility u=new Utility();
		System.out.println("\n Enter Number Of Rows");
		int r=u.inputInteger();
		
		System.out.println("\n Enter Number of Cloumns");
		int c=u.inputInteger();
		
		int [][] x=arrayInt(r,c);
		double[][] y =arrayDouble(r,c);
		String [][] z=arrayBoolean(r,c);
		
		//call display method
		u.display(x,y,z,r,c);
		
			
	}
	
	
	//integer number
	private static int[][] arrayInt(int r, int c) {
		// TODO Auto-generated method stub
		int x[][]=new int[r][c]; //create the int 2d array
		Utility u=new Utility();
		System.out.println("Interger Array");
		for(int i=0;i<r;i++)    //for integer row number
		{
			for(int j=0;j<c;j++)  //for interger column number
			{
				x[i][j]=u.inputInteger();   
			}
	
	}
		return x;
}


	//for double number
	private static double[][] arrayDouble(int r, int c) {
		// TODO Auto-generated method stub
		double[][] y= new double[r][c];  //create the double 2d array
		Utility u=new Utility();
		System.out.println("Double Array");
		
		for(int i=0;i<r;i++)   //for rows
		{ 
			for(int j=0;j<c;j++)  //for column
			{
				y[i][j]=u.inputDouble();
			}
		}
		
		return y;
	}
	
	

	public static String[][] arrayBoolean(int r,int c)
	{
	String z[][]=new String[r][c];
	Utility u=new Utility();    
	System.out.println();
	System.out.println("Boolean Array"); 

		for(int i = 0; i<r; i++)  //for rows
		{
			for (int j = 0; j<c; j++)  //for coluns
			{
				z[i][j] = u.inputString();
			}   
		}
	return z;
	}



}


