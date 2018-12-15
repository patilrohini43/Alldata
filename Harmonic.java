package all.program.com;

import java.util.Scanner;

public class Harmonic {
	public static void main(String args[])
	{
		double result=0,j=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the harmonic you want to find");
		int n=sc.nextInt();
	
for (j = 1; j <= n; j++) {
	num = num + (1 / j);
	result = num;
}
System.out.println("the value of harmonic no. " + n + " is: " + result);
}
	
}