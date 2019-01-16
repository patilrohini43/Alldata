package com.bridgelabz.Factory;

public class ComputerFactory {

	
		 
	  public  static Computer getComputer(String type,String Keyboard,String harddisk,String mouse,String ram) {
		// TODO Auto-generated method stub
		if("PC".equalsIgnoreCase(type))
		{
			return new PC(Keyboard,harddisk,mouse,ram); 
		}
		else if("Laptop".equalsIgnoreCase(type))
		{
			return new Laptop(Keyboard,harddisk,mouse,ram); 
		}
		return null;
	  }


}
