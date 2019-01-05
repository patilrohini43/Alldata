
/*
* Created by:Rohini Patil
* Date 13/12/2018
* Purpose: Flip Coin and print percentage of Heads and Tails
**/


package all.program.com;

import all.program.utility.Utility;

public class FlipCoin {
	public static void main(String args[])
	
	{
		Utility u=new Utility();
		//accept the value from user
		System.out.println("enter  no of times  to flip the coin");
		int times = u.inputInteger();
		//call the perFlip method
        u.perFlip(times);
	}
}
