package com.bridelabz.util;


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



@SuppressWarnings("unused")
public class Jsonutil {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static String getString()
	{
		String string="";
		return string=scanner.nextLine();
	}
	
	
	public static int getInt()
	{
      int number=scanner.nextInt();
	return number;

	}
	
	
	public static void strClose()
	{
		scanner.close();
	}
}