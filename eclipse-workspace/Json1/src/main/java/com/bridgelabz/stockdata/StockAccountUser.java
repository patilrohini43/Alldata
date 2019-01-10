package com.bridgelabz.stockdata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeLabz.stock1.Stocks;




public class StockAccountUser{

    List<Stocks> stocklist=new ArrayList<Stocks>();
	List<String> transition=new ArrayList<String>();
    int amount;

   

/**
	public List<String> getTransition() {
		return transition;
	}


	public void setTransition(List<String> transition) {
		this.transition = transition;
	}
**/

	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	/**
	public boolean createAccount(String name) throws IOException
	{
		File file=new File("/home/admin1/Documents/"+name+".json");
	    boolean result = file.createNewFile();
		
		return result;
		
		
		
	}
	**/


	public StockAccountUser(String name)
	{
		if(!new File("/home/admin1/Documents/"+name+".json").exists())
		{
			FileOutputStream file;
		
			this.amount=1000;
			try
			{
				file = new FileOutputStream("/home/admin1/Documents/"+name+".json");
				new ObjectMapper().writeValue(new File("/home/admin1/Documents/"+name+".json"), this);
				file.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			finally {
				System.out.println("Account Created");
			}
		}
		else
		{
			System.out.println("Account already exist");
		}
		
	
}


	public List<String> getTransition() {
		return transition;
	}


	public void setTransition(List<String> transition) {
		this.transition = transition;
	}


	public  StockAccountUser(String name,int x)throws Exception
	{
	
		ObjectMapper mapper=new ObjectMapper();
		//File file=new File("/home/admin1/Documents/"+name+".json");

		StockAccountUser stockdata=(StockAccountUser)mapper.readValue(new File("/home/admin1/Documents/"+name+".json"),new TypeReference<StockAccountUser>() {});
	   this.stocklist=stockdata.stocklist;
	   this.transition=stockdata.transition;
	   this.amount=stockdata.amount;
	
	}

	


	
	
}
