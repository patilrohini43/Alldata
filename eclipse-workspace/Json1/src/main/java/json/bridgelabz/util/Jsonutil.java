package json.bridgelabz.util;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import json.bridgeLabz.com.Inventory;

public class Jsonutil {
	
	private static ObjectMapper mapper;
	static Inventory inventory=new Inventory();
	
	static {
		mapper=new ObjectMapper();
	}
	
public static String convertJavaToJson(Object object) 
{
	
    String result="";
	System.out.println(object);
	try
	{
		 inventory.setEmpName("Rohini");
	     inventory.setWeight(50);
	     inventory.setSalary(25000);
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



}
