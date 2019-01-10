package com.bridgeLabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class InventoryManagment
{
    public static void main( String[] args ) throws IOException 
    {
        //Inventory inventory=new Inventory();
     
  
       //call the method convertJavaToJson
       // String data=json.convertJavaToJson(inventory);
       // System.out.println(data);
        
        File file=new File("/home/admin1/inventory.json");
        ObjectMapper mapper=new ObjectMapper();
        List<Inventory> list=new ArrayList<>();
        list=mapper.readValue(file, new TypeReference<List<Inventory>>() {});
        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println("Name:-"+list.get(i).getName()+" ,Weight;-"+list.get(i).getWeight()+", Price:-"+list.get(i).getPrice());
            int weight=list.get(i).getWeight();
            int price=list.get(i).getPrice();
            int total=weight*price;
            System.out.println("Total Price "+total);
         }
        
        
        
        

        
    }
}
