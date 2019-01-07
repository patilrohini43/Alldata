package json.bridgeLabz.com;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import json.bridgelabz.util.Jsonutil;

/**
 * Hello world!
 *
 */
public class InventoryManagment
{
    public static void main( String[] args ) 
    {
        Inventory inventory=new Inventory();
        Jsonutil json=new Jsonutil();
     
        //call the method convertJavaToJson
       String data=json.convertJavaToJson(inventory);
       System.out.println(data);
        
        

        
    }
}
