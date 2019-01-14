package com.bridgeLaz.addressbook;

import json.bridgelabz.util.Jsonutil;

public class MainManagerAddressBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//AddressBook address=new AddressBook();
	    
		//address.Opeartion();
		
		AddressManager manager=new AddressManager();
		
		
		System.out.println("************Wel-Come To AddressBook**************");
		int ch=0;
		do
		{
			System.out.println("Choose Option What Do You Want");
			System.out.println("1.Create");
			System.out.println("2.Open");
			System.out.println("3.Save");
			System.out.println("4.SaveAs");
			System.out.println("5.Close");
			System.out.println("6.Quit");
			ch=Jsonutil.getInt();
			switch(ch)
			{
			case 1:
				manager.Create();
				 break;
				 
			case 2:
				manager.open();
				 break;
				 
				 
			case 3:
				manager.save();
				  break;
			case 4:
				manager.saveAs();
				  break;
				  
				  
				  
			case 5:
				 break;
				 
				 
			case 6:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Please Enter Correct Choice");
				 
				 
				 
				 
			}
			
			
		}while(ch!=6);
		

	}

}
