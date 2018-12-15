package all.program.com;

import java.util.Scanner;

public class Coupen {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the data you want");
	    String str=sc.nextLine();
	    char[] chars=str.toCharArray();
	    int max=100000;
	    int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}

		
	}


