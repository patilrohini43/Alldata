package all.program.com;

import all.program.utility.*;;
public class SumOfThree
{
	public static int findDistinctTriplets(int b[],int length)
	{
		
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		Utility u1=new Utility();
		System.out.println();

		
		System.out.print("Enter Size of Array :");
		int size=u1.inputInteger();
		int arr[]=new int [size];//create array & read values one by one

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=u1.inputInteger();
		}

		SumOfThree t1=new SumOfThree();
		int sum=t1.findDistinctTriplets(arr,size);
		System.out.println("No.of Tripltes :"+sum);
		System.out.println();
	}
}