package com.bridgeLabz.stock1;
import java.io.File;

import java.io.FileOutputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;





public class StockAccount {
	
	

	//create the getter and setter method 
	List<Stocks> stocklist=new ArrayList<>();
	

	List<String> transition=new ArrayList<>();
	static int amount;
	

	public StockAccount()
	{
		
	}
	

	
	
	
	/**
	 * This function is create the new file of user and also
	 * check the file is exist or not
	 * @param name  accept the user name
	 */
	
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
	/**
	*
	 * This function read the user file which is created and access the list of
	 * stocklist and trasaction and amount
	 * @param name login name of user
	 * @param x
	 */
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
	
		

	
	
	
	

   /**This method is create first company share file,this file stored the information of company share
    * when user buy that time 1st match the symabol of company in company share file
    * if match then users share is minus to original share and display amount
    * @param symbol  accept the symbol from user
    * @param noofshare  accept the share from user
    * @param namelogin login name of user i.e already register
    */

	public void buy(String symbol,int noofshare,String namelogin)
	{
		try 
		{
			//read the file
			List<Stocks> list=new ObjectMapper().readValue(new File("/home/admin1/Documents/stockdata.json"), new TypeReference<List<Stocks>>() {});
			
			//create StackList for perform the opeartion
			StackList<Stocks> stockmain=new StackList<>();
			
			for(int i=0;i<list.size();i++)
			{
				stockmain.push(list.get(i));
				
			}
			int i=0;
			String name="";
			int price=0;
			int amount=1000;
			
			for(i=0;i<stockmain.size();i++)
			{
				Stocks tempvalue=stockmain.pop1();
				
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
						stockmain.push(tempvalue);
						amount-=noofshare*tempvalue.pricepershare;
						break;
					}
				}
				else
				{
					stockmain.push(tempvalue);
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
				fill.add(stockmain.pop1());
			}
			new ObjectMapper().writeValue(new File("/home/admin1/Documents/stockdata.json"), fill);
			boolean stockfindflag=false;
			for(int j=0;j<stocklist.size();j++)
			{
				Stocks temp=stocklist.get(j);
				if(temp.stockssymbol.equals(symbol))
				{
					stockfindflag=true;
					
					//Current Date
					LocalDateTime today = LocalDateTime.now();
					String s=symbol+" buy  "+today;
					transition.add(s);
					stocklist.get(j).numberofshare+=noofshare;
					break;
				}
				
			}
		
			if(stockfindflag==false)
			{
				stocklist.add(new Stocks(name,symbol,noofshare,price));
				//Current Date
				LocalDateTime today = LocalDateTime.now();
				String s=symbol+" buy  "+today;
				transition.add(s);
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
}

	/**
	 * This function when user sell that time first check the symbol is match to company share
	 * if match share is less than accept the share from user then plus the original share from accepting share
	 * and write the data from user file
	 */
	public void sell(String symbol,int noofshare,String namelogin)
	{
		try 
		{
			for(int i=0;i<stocklist.size();i++)
			{
				Stocks temp=stocklist.get(i);
				if(temp.stockssymbol.equals(symbol))
				{
					if(temp.numberofshare<noofshare)
					{
						System.out.println("Not Have Sufficient Shares");
						return;
					}
					stocklist.get(i).numberofshare-=noofshare;
					
					//Current Date
					LocalDateTime today = LocalDateTime.now();
					String s=symbol+" sell "+today;
					transition.add(s);
					amount+=stocklist.get(i).pricepershare*noofshare;
					break;
				}
			}
			
			StackList<Stocks> stockmain=new StackList<>();
			/**
			List<Stocks> list=new ObjectMapper().readValue(new File("/home/admin1/Documents/stockdata.json"), new TypeReference<List<Stocks>>() {});
		
			
			for(int i=0;i<list.size();i++)
			{
				stockmain.push(list.get(i));
			}
			
			for(int i=0;i<stockmain.size();i++)
			{
				Stocks tempvalue=stockmain.pop1();
				if(tempvalue.stockssymbol.equals(symbol))
				{
					tempvalue.numberofshare+=noofshare;
					stockmain.push(tempvalue);
				}
				else
				{
					stockmain.push(tempvalue);
				}
			}
			**/
			List<Stocks> fill=new ArrayList<>();
			while(!stockmain.isEmpty())
			{
				fill.add(stockmain.pop1());
			}
			new ObjectMapper().writeValue(new File("/home/admin1/Documents/stockdata.json"), fill);
					
		}
		catch(Exception e)
		{
			
		}
			
	}
	
	/**
	 * save the file 
	 * @param filename this name of file
	 */
	public void save(String filename)
	{
		try
		{
			new ObjectMapper().writeValue(new File("/home/admin1/Documents/"+ filename+".json"), this);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * this function display the StockDetails,TransactionDetails
	 */
	public void printReport()
	{
		System.out.println("StockName    StockSymbol   NoOfShare  SharePrice");
		System.out.println();
		for(int i=0;i<stocklist.size();i++)
		{
			Stocks temp=stocklist.get(i);
			System.out.println(temp.stocksname+"           "+temp.stockssymbol+"           "+temp.numberofshare+"           "+temp.pricepershare);
		}
		System.out.println();
		
		System.out.println("Transition Details");
		System.out.println();
		for(int i=0;i<transition.size();i++)
		{
			String temp=transition.get(i);
			System.out.println(temp);
		}
		System.out.println();
		System.out.println("Amount Left="+amount);
		System.out.println();
		System.out.println();
	}

	
}
