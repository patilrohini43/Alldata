package json.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import json.bridgeLabz.com.Inventory;

public class Jsonutil {
	
	Scanner scanner=new Scanner(System.in);
	
	public String getString()
	{
		String string="";
		return string=scanner.nextLine();
	}
	
	public int getInt()
	{
      int number=scanner.nextInt();
	return number;
	
	}
	
	
	
	//The SimpleDateFormat class is also used for formatting date
	/**
	 * print current date by providing date pattern
	 * @return-->date in given format
	 * 
	 */
		
		public static String currentDateTime()
		{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date); //2016/11/16 12:08:43
		}
	
	
	
	private static ObjectMapper mapper;
	static Inventory inventory=new Inventory();
	
	static {
		mapper=new ObjectMapper();
	}
	
/**
 * Purpose:convert the java String into Json String 	
 * @param object this used for assign Inventory object 
 * @return coversion of result display
 */
public static String convertJavaToJson(Object object) 
{
	
    String result="";
	System.out.println(object);
	try
	{
	   //  inventory.setRice(20);
	   //  inventory.setPulses(15);
	   //  inventory.setWheats(45);
	     
	//Convert object to JSON string and save into file directly 
	mapper.writeValue(new File("/home/admin1/inventory"), inventory);

	result=mapper.writeValueAsString(inventory);
	
	//Convert object to JSON string and pretty print
	result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inventory);
	
	
	}
	catch(JsonGenerationException e)
	{
		e.printStackTrace();
	}
	catch(JsonMappingException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	return result;
}


/**
 * This method is match the regex and replace the string
 * @param message  the original string
 * @param change what you want change
 * @param requried where uu want to replace
 * @return
 */
public  String convertString(String message,String change,String requried)

{

	Pattern p=Pattern.compile(change);
	Matcher m=p.matcher(message);
	message=m.replaceAll(requried);
	
	return message;
	
}



//This method read the input from file and display on console
public static void jsonObjectMethod() throws org.json.simple.parser.ParseException
{

//JSON parser object to parse read file
JSONParser jsonParser = new JSONParser();

try (FileReader reader = new FileReader("/home/admin1/employees.json"))
{
	//Read JSON file
    Object obj = jsonParser.parse(reader);

    JSONArray stockList = (JSONArray) obj;
    System.out.println(stockList);
    
    //Iterate over stock array
    stockList.forEach( emp -> Jsonutil.parseEmployeeObject( (JSONObject) emp ) );

} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) 
{
    e.printStackTrace();
}

}



/**
 * purpose:get the input from file and calculate value of stock
 * @param stock create the stock objet for accessing the list 
 */

public static void parseEmployeeObject(JSONObject stock) 
{
	//Get stock object within list
	JSONObject stockObject = (JSONObject) stock.get("stock");
	

	//Get stock name first name
	String stockName = (String) stockObject.get("StockNames");	
	System.out.println("Stock Name:-"+stockName);

	
	//Get number of share last name
	String share = (String)stockObject.get("NumberofShare");	
	int numShare = Integer.parseInt(share);	
	System.out.println("Number Of Share:-"+numShare);

	
	//Get shareprice
	String price = (String) stockObject.get("SharePrice");	
	//System.out.println(price);
	int sharePrice = Integer.parseInt(price);	
	System.out.println("Share Price:-"+sharePrice);
	
	
	
	 int total=numShare*sharePrice;
     System.out.println("Total Value Of Stock is:-"+total);
     
    
	int totaleach=total/numShare;
     System.out.println("Price Per Share " +totaleach);
	
     System.out.println();
     
	
}


/**
 * Deal 52 cards uniformly at random.
 * Shuffle the cards using Random method
 */
public static void dackOfCard()
{
     String[] Suits = {
         "Clubs", "Diamonds", "Hearts", "Spades"
     };

     String[] Ranks = {
         "2", "3", "4", "5", "6", "7", "8", "9", "10",
         "Jack", "Queen", "King", "Ace"
     };

     // initialize deck
     int n = Suits.length * Ranks.length;
     String[] deck = new String[n];
     for (int i = 0; i < Ranks.length; i++)
     {
         for (int j = 0; j < Suits.length; j++) 
         {
        
             deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
             //System.out.println("-------"+deck[Suits.length*i + j]);
         }
     }

     // shuffle
     for (int i = 0; i < n; i++) {
         int r = i + (int) (Math.random() * (n-i));
         String temp = deck[r];
         deck[r] = deck[i];
         deck[i] = temp;
      
     }

     // print shuffled deck
     for (int i = 0; i < n; i++) {
         System.out.println(deck[i]);
     }
 }


public static void play()
{
	
//create array of suits and rank
String suits[]= {"clubs","hearts","diamond","spade"};
String rank[]= {"2","3","4","5","6","7","8","9","10","king","queen","jack","ace"};

//create the object of random
Random r=new Random();

String player1[]=new String[9];
String player2[]=new String[9];
String player3[]=new String[9];
String player4[]=new String[9];
String player[]=new String[36];
int k=0;
	for(int j=0;j<9;j++)
	{
		
		player1[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
		//System.out.println(player1[j]);
		player[k]=player1[j];
		k++;
		player2[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
		player[k]=player2[j];
		k++;
		player3[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
		player[k]=player3[j];
		k++;
		player4[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
		player[k]=player4[j];
		k++;
	
	
		 for(int i = 0; i<k-1;i++ ) 
		 {
	         for(int l = i+1; l<k; l++) 
	         {
	        	 if(player[i].equals(player[l])) 
	        	 {
	            		j--;
	            		k=k-4;
	            		break; 
	            }
	         }
	         
	      }
		 
	}	
	System.out.println();
	
	//print the value
	for(int i=0;i<9;i++)
	{
		System.out.print(player1[i]+"         "+player2[i]+"          "+player3[i]+"           "+player4[i]);
		System.out.println();
	}
	
	

}



}
