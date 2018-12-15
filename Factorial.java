package all.program.com;

import java.util.Scanner;

public class Factorial {
	public static boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
	 	return true;
}
	
	public static void main(String args[])
	
	{
	
		int n = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number you want ");
				int num=sc.nextInt();
		System.out.println("prime Factor of  num "+num+"is:");
		
				for(int i=2;i<=n;i++)
				{
					if(isPrime(i))
					{
						System.out.println(i+"");
					}
							
				}
				
				System.out.println();
				
	}

}
