package com.bridgelabz.creational;

public class MainThreadSafeSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeSingleton instance=ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton.getInstanceUsingDoubleLocking();
	}

}
class ThreadSafeSingleton{
	
	private static ThreadSafeSingleton instance;
	
	public ThreadSafeSingleton()
	{
		
	}
	
public static synchronized ThreadSafeSingleton getInstance()
{
	if(instance==null)
	{
		instance=new ThreadSafeSingleton();
	}
	return instance;
}
	



public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
}