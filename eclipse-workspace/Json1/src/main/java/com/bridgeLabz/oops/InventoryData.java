package com.bridgeLabz.oops;

import json.bridgelabz.util.Jsonutil;

public class InventoryData {
	
	public static void main(String[] args)
	{
		
		Inventory list=new Inventory();
		//accept the input from user
		System.out.println("Enter Name Of Product");
		String name=Jsonutil.getString();
		list.setName(name);
		
		System.out.println("Enter Weight of Product");
		int weight=Jsonutil.getInt();
		list.setWeight(weight);
		
		System.out.println("Enter Price of Product");
		int price=Jsonutil.getInt();
		list.setPrice(price);
		//calculate total of weight and price
		int total=list.setTotal(weight*price);
		System.out.println("Total "+total);
		//call method 
		Jsonutil.filewrite(list);
      
	}

}