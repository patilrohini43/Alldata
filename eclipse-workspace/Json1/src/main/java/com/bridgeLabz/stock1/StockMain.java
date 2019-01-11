package com.bridgeLabz.stock1;

import java.util.Scanner;

import json.bridgelabz.util.Jsonutil;

public class StockMain {
	public static void main(String[] args)
	{	
		int Answer=0;
		Scanner scanner=new Scanner(System.in);
	
		do
		{
			System.out.println("1. Create  Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			Answer=Jsonutil.getInt();
			switch(Answer)
			{
			case 1:
				System.out.println("Enter Name");
				String name=scanner.nextLine();
				StockAccount newperson=new StockAccount(name);
				break;
				
			case 2:
				System.out.println("Enter Name");
				String namelogin=scanner.nextLine();
				StockAccount currentperson=new StockAccount(namelogin, 2);
				try {
					int Answer2=0;
					do {
						System.out.println("1. Buy");
						System.out.println("2. Sell");
						System.out.println("3. PrintReport");
						System.out.println("4. Exit");
						Answer2=Jsonutil.getInt();
						switch(Answer2)
						{
							case 1:
								System.out.println("Enter Symbol");
							     String symbol=scanner.nextLine();
								System.out.println("Enter number");
							    int noofshare=scanner.nextInt();
							    currentperson.buy(symbol, noofshare,namelogin);
							
								break;
							case 2:
								System.out.println("Enter Symbol again");
								 String symbol1=scanner.nextLine();
								 
								 System.out.println();
								System.out.println("Enter number again");
								int noofshare1=scanner.nextInt();
								currentperson.sell(symbol1, noofshare1, namelogin);
								break;
							case 3:
								currentperson.printReport();
								break;
							case 4:
								currentperson.save(namelogin);
								System.out.println("Exiting");
							
								break;
							default :
								System.out.println("Invalid Entry");												
						}
					}while(Answer2!=4);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}		
				break;
				
			case 3:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Invalid Entry");
			}
		}while(Answer!=3);
}
}
