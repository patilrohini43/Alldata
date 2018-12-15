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
		
		
		display(x,y,z,r,c);
		
			
	}
	
	
	//integer number
	private static int[][] arrayInt(int r, int c) {
		// TODO Auto-generated method stub
		int x[][]=new int[r][c];
		Utility u=new Utility();
		System.out.println("Interger Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				x[i][j]=u.inputInteger();
			}
	
	}
		return x;
}

	
	

	//for double number
	private static double[][] arrayDouble(int r, int c) {
		// TODO Auto-generated method stub
		double[][] y= new double[r][c];
		Utility u=new Utility();
		System.out.println("Double Array");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
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

		for(int i = 0; i<r; i++)
		{
			for (int j = 0; j<c; j++)
			{
				z[i][j] = u.inputString();
			}   
		}
	return z;
	}


	
	

	
	


	//Display all Method
	
	public static void display(int[][]x,double[][]y,String[][]z,int r,int c )
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		
		System.out.println();
		pw.println("Integer Number");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				
			{
				pw.print("\t"+x[i][j]+" ");
				
			}
			pw.print("\n");
		}
	
		
		
		
		System.out.println();
		pw.println("Double Number");
				
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
						
					{
						pw.print("\t"+y[i][j]+" ");
					}
					pw.print("\n");
				}
		
		
				//display boolean
				System.out.println();
				pw.println(" ARRAY BOOLEAN");
						
				for(int i = 0; i<r; i++)
				{
					for (int j = 0; j<c; j++)
					{
						pw.print("\t"+z[i][j]+" ");
					} 
				pw.println("\t");
				}
			}
	

}


