package com.bridgelabz.stockdata;



import java.util.Scanner;



import json.bridgelabz.util.Jsonutil;

public class StockAccount {
	
	private static final int choice = 0;

	public static void main(String[] args) throws Exception
	{
		
		

		
	
		
	
		 Scanner scanner = new Scanner(System.in);
		// StockAccountUser user=new StockAccountUser();
		System.out.println("************Stock Project****************************");
		System.out.println("-------------------------------------------------------");
		
     
	do
      {
       
		int choice=1;
       System.out.println("1.Create New Account");
       
       System.out.println("2.login");
       
       System.out.println("3.Exit");
       
       choice=Jsonutil.getInt();

       switch(choice)
       {
       case 1:
    	        System.out.println("Enter User Name");
    	       
    	        String name = scanner.nextLine();
    	      
    	        StockAccountUser stock=new StockAccountUser(name);
    	       
    	         break;
    	         
    	         
    	         
         
       case 2:
    	   
    	   
    	      System.out.println("Enter User Name");
    	     
  	          String loginname = scanner.nextLine();
  	       System.out.println("hsdgf");
  	        StockAccountUser current =new StockAccountUser(loginname,2);
  	        System.out.println("hello");
    	       try
    	       {
    	    	   int choice1=0;
    	    	    {
    	    		   
    	    		   System.out.println("1.Buy");
    	    		   System.out.println("2.Sell");
    	    		   System.out.println("3.PrintReport");
    	    		   System.out.println("4.Exit");
    	    		   
    	    		   choice1=Jsonutil.getInt();
    	    		   switch(choice1)
    	    		   {
    	    		   
    	    		   case 1:
    	    			   System.out.println("Enter Symbol ");
    	    			   String symbol=scanner.nextLine();
    	    			   System.out.println("Enter Number");
    	    			   int numofshare=scanner.nextInt();
    	    			   
    	    			   break;
    	    		   
    	    		   case 2:
    	    			   
    	    			   System.out.println("Enter Symbol ");
    	    			   String symbol1=scanner.nextLine();
    	    			   System.out.println("Enter Number");
    	    			   int numofshare1=scanner.nextInt();
    	    		       
    	    			   break;
    	    			   
    	    			   
    	    		   case 3:
    	    			     
    	    			        break;
    	    			        
    	    			        
    	    		   case 4:
    	    			     
    	    			        break;
    	    			        
    	    			        
    	    		   case 5:
    	    			       
    	    			       break;
    	    			       default:
    	    			    	   System.out.println();
    	    		   
    	    		   }
    	   
    	       
    	    	       }
    	            while(choice1!=2);
    	       }
    	       catch(Exception e)
				{
					e.printStackTrace();
				}		
                 break;
    	       
      
      
    	        
       case 3:
    	          System.out.println("Exiting");
                 break;
                 default:
                	 System.out.println("Invalid Input");
                
       
       }
       
       
	
      
      }while(choice!=2);
	
 

}
	
}
