package com.bridgelabz.creational;

public class MainLazyInitialization {
	
	public static void main(String[] args)
	{
	 LazyInitialization instance=LazyInitialization.getInstance();
	}

}
class LazyInitialization
{
	static LazyInitialization instance;
	
	
	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance()
	
	{
		if(instance==null)
		{
			instance=new LazyInitialization();
			
		}
		return instance;
		
	}
}
