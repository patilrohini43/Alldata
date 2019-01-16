package com.bridgelabz.creational;

public class MainBillPughSingleton {
	public static void main(String[] args)
	{
		BillPughSingleton instance=BillPughSingleton.getInstance();
	}

}
 class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}