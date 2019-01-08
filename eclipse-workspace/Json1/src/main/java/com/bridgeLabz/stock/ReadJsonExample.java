package com.bridgeLabz.stock;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import json.bridgelabz.util.Jsonutil;

public class ReadJsonExample {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws org.json.simple.parser.ParseException 
	{    
		//Create Object
		Jsonutil util=new Jsonutil();
		System.out.println("******************Stock Report*********************");
		//call method
		Jsonutil.jsonObjectMethod();
	}

	
}