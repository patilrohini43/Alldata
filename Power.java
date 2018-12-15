package all.program.com;

import java.util.Scanner;

public class Power {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int i=0;
		int powerOfTwo=1;
		
		while
			(i<=num)
		{
			System.out.println(i + " " + powerOfTwo);  
			powerOfTwo = 2 * powerOfTwo; 
              i = i + 1;
		}
		
		
		
	}

}
