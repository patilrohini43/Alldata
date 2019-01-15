

package com.bridgelabz.creational;

public class MainEagerInitailization 
{
	public static void main(String[] args)
   {
		// TODO Auto-generated method stub

		EagerInitailization obj=EagerInitailization.getInstance();   //any condition we create only one instance class
		
		
		
	}
}
	

class EagerInitailization{
	//create static instance
	static EagerInitailization obj=new EagerInitailization();
	 
	//create constructor
	private EagerInitailization()
	{
		
	}
	
	//create static method
	public static EagerInitailization getInstance()
	{
		return obj;
		
	}
	
	
}