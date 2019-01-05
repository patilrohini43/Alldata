/*
* Created by:Rohini Patil
* Date 17/12/2018
* Purpose:Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
**/



package all.program.com;


import all.program.utility.Utility;

class Distance 
{ 
 
    public static void main (String[] args) 
    
    { 
    	Utility u=new Utility();
    
    	// accept the parameter values x1 ,x2 and Y1,Y2
    	System.out.println("Enter the X1 & Y1");
    	int x1=u.inputInteger();
    	
    	int y1=u.inputInteger();
    	
    	System.out.println("Enter the X2 & Y2");
    	int x2=u.inputInteger();
    	
    	int y2=u.inputInteger();
    	
    	//System.out.println("value is  " +u.distance1(x1, y1, x2, y2));
      System.out.println(Math.round(u.distance1(x1, y1, x2, y2)*100000.0)/100000.0); 
    } 
} 