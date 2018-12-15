package all.program.com;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double root1,root2,d;
		System.out.println("Given Quadratic Equation =ax^2+bx+c");
		System.out.println("Enter A value");
		int a=sc.nextInt();
		
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		System.out.println("Enter C value");
		int c=sc.nextInt();
		
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
		 d=b * b - 4 * a * c;
		if(d>0)
		{
            System.out.println("Roots are real and unequal");

            root1 = ( - b + Math.sqrt(d))/(2*a);

            root2 = (-b - Math.sqrt(d))/(2*a);

            
            System.out.println("First Root"+root1);
            System.out.println("First Root"+root2);
            
		}
		
		else if(d==0)
		{
			System.out.println("Roots are real and equal");

             root1 = ( - b + Math.sqrt(d))/(2*a);
             System.out.println("First Root"+root1);
         
		}
		
		else
		{
			System.out.println("Roots are imaginary");
		}
		
		
		
		
		
	}

}
