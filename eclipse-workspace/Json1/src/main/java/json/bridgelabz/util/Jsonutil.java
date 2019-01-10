package json.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.text.DateFormat;

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

import com.bridgeLabz.oops.Inventory;

@SuppressWarnings("unused")
public class Jsonutil {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static String getString()
	{
		String string="";
		return string=scanner.nextLine();
	}
	public static void strClose()
	{
		scanner.close();
	}
	
	public static int getInt()
	{
      int number=scanner.nextInt();
	return number;
	
	}

	/**
	 * To get String with Space's
	 * 
	 * @return String
	 */
	public static String getLine() {
		String i = scanner.nextLine();
		return i;

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
	private static FileWriter file;
	
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
 * This method get the data from user and write into file in json format
 * @param inventory is the object Inventory class
 */

public static void filewrite(Inventory inventory) 
{
	
	ObjectMapper mapper=new ObjectMapper();
	String json="[";
	JSONParser parser=new JSONParser();
	try {
			File file=new File("/home/admin1/inventory.json");
			
			//if the file is empty 
			if(file.length()==0)
			{
					
	        		 json=json+mapper.writeValueAsString(inventory)+"]";
			}
			
			{    
				//read the data from file
				Object object = parser.parse(new FileReader("/home/admin1/inventory.json"));
				JSONArray array=new JSONArray();
				array=(JSONArray) object;
				for (int j = 0; j < array.size(); j++) {
					json=json+array.get(j)+",";
					//System.out.println(json);
				}
				json=json+mapper.writeValueAsString(inventory)+"]";
				System.out.println(json);

			}
		
			
		}

			catch (IOException e1) {
					e1.printStackTrace();
			} catch (org.json.simple.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 try  {
		    file = new FileWriter("/home/admin1/inventory.json");
		 	file.write(json);
		 	file.flush();
	 		}
	 catch (IOException e) {
	        e.printStackTrace();
	    }
	   
	 
}












/**
 * This method is match the regex and replace the string
 * @param message  the original string
 * @param change what you want change
 * @param requried where uu want to replace
 * @return
 */
public static  String convertString(String message,String change,String requried)
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
    public static String[] getCard(String[] Suits,String[] Ranks)
    {
    	  int n = Suits.length * Ranks.length;
    	     String[] deck = new String[n];
    	     for (int i = 0; i < Ranks.length; i++)
    	     {
    	         for (int j = 0; j < Suits.length; j++) 
    	         {
    	        
    	             deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
    	        	// deck[i]=Ranks[i]+Suits[i];
    	        	 
    	           //  System.out.println("-------"+deck[Suits.length*i + j]);
    	         }
    	     }
			return deck;
    	
    }



   public static String[] shuffle(String[] deck,int times)
   {
	// shuffle
	   int n=52;
	     for (int i = 0; i < n; i++) {
	         int r = i + (int) (Math.random() * (n-i));
	         System.out.println(+r);
	         String temp = deck[r];
	         deck[r] = deck[i];
	         deck[i] = temp;
	      
	     }
		return deck;
   }


   public static String[][] distributeCards(String[] deck)
	{
		int count = 0;
		String playerCards[][] = new String[4][9];
		for(int i = 0; i < 4 ; i++)
		{
			for(int j = 0; j < 9 ; j++)
			{
				playerCards[i][j] = deck[count];
				count++;
			}
		}
		return playerCards;
	}

   
   

   
}
