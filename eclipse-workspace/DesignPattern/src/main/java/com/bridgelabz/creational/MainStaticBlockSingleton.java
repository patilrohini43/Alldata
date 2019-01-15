package com.bridgelabz.creational;

public class MainStaticBlockSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlockSingleton instance=StaticBlockSingleton.getInstance();
		
		
	}
}
	
class StaticBlockSingleton
{

	static  StaticBlockSingleton instance;
	
	private StaticBlockSingleton()
	{
		
	}
	
	//static block initialization for exception handling
    static{
        try{
            StaticBlockSingleton instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
		return instance;
        
    }
	
}