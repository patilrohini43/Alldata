package com.bridgelabz.Factory;

public class Laptop extends Computer{

	private String keyboard;
	private String harddisk;
	private String mouse;
	private String ram;
	
	
	public Laptop(String keyboard,String harddisk,String mouse,String ram)
	{
		this.keyboard=keyboard;
		this.harddisk=harddisk;
		this.mouse=mouse;
		this.ram=ram;
		
	}
	
	
	
	
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
	mouse = mouse;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	
	
	
	
	
}
