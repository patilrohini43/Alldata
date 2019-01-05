/*
*Created by:Rohini Patil
* Date 15/12/2018
* Purpose:Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
**/
package all.program.com;

import all.program.utility.Utility;

public class StopWatch {

	 
		 static Utility u=new Utility();
	public static void main(String args[])
	{
	     //press 1 to stat 

		System.out.println("press 1 to start time");
		u.inputInteger();
		
		u.start();   //call start method
		
		System.out.println("press 2 to end time");   //press 2 end time
		u.inputInteger();
		u.end();      //call end method
		
		long l=u.RunningTime();  //call running method to calculate running time 
		System.out.println();
		System.out.println("Total Time1 Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

		
	}
		
		
		
		
		
		
	}

