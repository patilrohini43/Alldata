package com.bridgeLabz.stock1;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class StockAccount {
	
	

	List<Stocks> stocklist=new ArrayList<>();
	

	List<String> transition=new ArrayList<>();
	int amount;
	

	public StockAccount()
	{
		
	}
	public StockAccount(String name)
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
	public StockAccount(String name,int x)
	{
		try
		{
			ObjectMapper ob=new ObjectMapper();
	
		StockAccount persontemp=(StockAccount)ob.readValue(new File("/home/admin1/Documents/"+name+".json"),new TypeReference<StockAccount>() {});
	
		this.stocklist=persontemp.stocklist;

		this.transition=persontemp.transition;
		
		this.amount=persontemp.amount;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
			
	}
	
	
	public List<Stocks> getStocklist() {
		return stocklist;
	}
	public void setStocklist(List<Stocks> stocklist) {
		this.stocklist = stocklist;
	}
	public List<String> gettransition()
	{
		return this.transition;
	}
	
	public void settransition(List<String> transition)
	{
		this.transition=transition;
	}
	
	public void setamount(int amount)
	{
		this.amount=amount;
	}
	
	public int getamount()
	{
		return this.amount;
}
	
		

	
	
	
	
	
	
	public void buy(String symbol,int noofshare,String namelogin)
	{
		try 
		{
			List<Stocks> list=new ObjectMapper().readValue(new File("/home/admin1/Documents/stockdata.json"), new TypeReference<List<Stocks>>() {});
			UnorderedList<Stocks> stockmain=new UnorderedList<>();
			for(int i=0;i<list.size();i++)
			{
				stockmain.add(list.get(i));
			}
			int i=0;
			String name="";
			int price=0;
			int amount=1000;
			for(i=0;i<stockmain.size();i++)
			{
				Stocks tempvalue=stockmain.pop();
				if(tempvalue.stockssymbol.equals(symbol))
				{
					if((noofshare*tempvalue.pricepershare)>amount)
					{
						System.out.println("Not Have Sufficient Amount");
						return;
					}
					else
					{	
						tempvalue.numberofshare-=noofshare;
						name=tempvalue.stocksname;
						price=tempvalue.pricepershare;
						stockmain.add(tempvalue);
						amount-=noofshare*tempvalue.pricepershare;
						break;
					}
				}
				else
				{
					stockmain.add(tempvalue);
				}
			}
			if(i==stockmain.size())
			{
				System.out.println("Invalid Symbol");
				return;
			}
			
			List<Stocks> fill=new ArrayList<>();
			while(!stockmain.isEmpty())
			{
				fill.add(stockmain.pop());
			}
			new ObjectMapper().writeValue(new File("/home/admin1/Documents/stockdata.json"), fill);
			boolean stockfindflag=false;
			for(int j=0;j<stocklist.size();j++)
			{
				Stocks temp=stocklist.get(j);
				if(temp.stockssymbol.equals(symbol))
				{
					stockfindflag=true;
					Date d=new Date();
					SimpleDateFormat a=new SimpleDateFormat("dd MM yyyy HH mm SS");
					String s=symbol+" buy  "+a.format(d);
					transition.add(s);
					stocklist.get(j).numberofshare+=noofshare;
					break;
				}
				
			}
			
			if(stockfindflag==false)
			{
				stocklist.add(new Stocks(name,symbol,noofshare,price));
				Date d=new Date();
				SimpleDateFormat a=new SimpleDateFormat("dd MM yyyy HH mm SS");
				String s=symbol+" buy  "+a.format(d);
				transition.add(s);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}

}
