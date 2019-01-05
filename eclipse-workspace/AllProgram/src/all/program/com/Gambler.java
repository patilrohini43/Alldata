/*
* Created by:Rohini Patil
* Date 14/12/2018
* Purpose:Gambler(Print Number of Wins and Percentage of Win and Loss)
**/

package all.program.com;


import all.program.utility.Utility;

public class Gambler {
	public static void main(String args[])
	{
		Utility u=new Utility();
		
		 // Enter the value of stake,goals,trails
		 
		System.out.println("stake");
		int stake=u.inputInteger();
		System.out.println("goals");
		int goal=u.inputInteger();
		System.out.println("trails");
		int trials=u.inputInteger();
		
		
        
         // print results
         
		int wins = u.gambler(stake, goal, trials);
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        int bets = u.gambler(stake, goal, trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		
		
	}

}
