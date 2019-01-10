package com.bridgeLabz.deckofcard;



import java.util.Arrays;

import json.bridgelabz.util.Jsonutil;

public class DeckOfCard {
	public static void main(String[] args)
	{
	
	System.out.println("************************Dack Of Cards**************");
	System.out.println();
	//call method

	String[] Suits = {
	        "Clubs", "Diamonds", "Hearts", "Spades"
	    };

	    String[] Ranks = {
	        "2", "3", "4", "5", "6", "7", "8", "9", "10",
	        "Jack", "Queen", "King", "Ace"
	    };
	    
	 String deck[]=Jsonutil.getCard(Suits,Ranks);
	 System.out.println("Enter how many time shuffle cards");
     int times=Jsonutil.getInt();           // taking how many time we shuffle cards
     //System.out.println("Shuffle cards:");
     String shuffle[] = Jsonutil.shuffle(deck,times);           // shuffle cards by using random function
      //   Utility.prinStringArray();             //Utility method for printing single dimensional array without shuffling
        Arrays.sort(deck);
     String player[][] = Jsonutil.distributeCards(deck);
     for(int i = 0 ; i < 4 ; i++)
     {
     	System.out.println("player"+(i+1)+":");
     	for(int j = 0; j< 9 ; j++)
     	{
     		System.out.print("    "+player[i][j]);
     	}
     System.out.println();
     }
    }
}
