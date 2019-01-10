package com.bridgelabz.stockdata;


public class Stock implements Comparable<Stock>   {
	

	String stocksname;
	String stockssymbol;
	int   numberofshare;
    int   pricepershare;
    

public Stock() {
		// TODO Auto-generated constructor stub
	}
/**
	public Stock(String stocksname,String stockssymbol,int numberofshare, int pricepershare)
	{
		this.stocksname = stocksname;
		this.stockssymbol = stockssymbol;
		this.numberofshare = numberofshare;
		this.pricepershare = pricepershare;
}
**/
    
	public String getStocksname() {
		return stocksname;
	}
	public void setStocksname(String stocksname) {
		this.stocksname = stocksname;
	}
	public String getStockssymbol() {
		return stockssymbol;
	}
	public void setStockssymbol(String stockssymbol) {
		this.stockssymbol = stockssymbol;
	}
	public int getNumberofshare() {
		return numberofshare;
	}
	public void setNumberofshare(int numberofshare) {
		this.numberofshare = numberofshare;
	}
	public int getPricepershare() {
		return pricepershare;
	}
	public void setPricepershare(int pricepershare) {
		this.pricepershare = pricepershare;
	}
	@Override
	public int compareTo(Stock arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    
    
    
    

}
