package com.bridgelabz.Factory;

public class Server {
	
	public static void main(String[] args)

	{
		Computer PC=ComputerFactory.getComputer("PC", "5", "500GB", "2","2GB");
		Computer Laptop=ComputerFactory.getComputer("PC", "4", "250GB", "1","4GB");
		
		
		
		System.out.println("Configuration of PC:-"+PC);
		
		System.out.println("Configuration of Laptop:-"+Laptop);
		
	}
}
