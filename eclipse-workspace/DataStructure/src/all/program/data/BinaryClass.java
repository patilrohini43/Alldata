package all.program.data;

import all.program.utility.Utility;


public class BinaryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("enter the limits");
		int limit=u.inputInteger();
		int number[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the number");
			number[i]=u.inputInteger();
			long x=Factorial.catalanNumber(number[i]);
			System.out.println("the possible number of "+number[i]+" node is "+x);
		}


	}

}



