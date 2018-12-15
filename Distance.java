package all.program.com;

import java.util.Scanner;

class Distance 
{ 
 
static double distance(int x1, int y1, int x2, int y2) 
{ 
  
    return Math.sqrt(Math.pow(x2 - x1, 2) +  
                Math.pow(y2 - y1, 2) * 1.0); 
} 
    public static void main (String[] args) 
    
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the x1 & Y1 AND X2 & Y2 ");
    	int x1=sc.nextInt();
    	int y1=sc.nextInt();
    	int x2=sc.nextInt();
    	int y2=sc.nextInt();
    	
        System.out.println(Math.round(distance(x1,y1,x2,y2)*100000.0)/100000.0); 
    } 
} 