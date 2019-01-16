package com.bridgelabz.Factory;

public abstract class Computer {
	
	
	public abstract String getKeyboard();
	
	public abstract String getHarddisk();
	
	public abstract String getMouse();
	
	public abstract String getRam();
	
	@Override
	public String toString()
	{
		return "Keyboard=" +this.getKeyboard()+
				", HardDisk=" +this.getHarddisk()+
				", Mouse="+this.getMouse()+
				", Ram="+this.getRam();
		
		
	}
	
}
