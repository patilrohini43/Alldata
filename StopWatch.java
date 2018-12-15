package all.program.com;

import all.program.utility.Utility;

public class StopWatch {

	 private int startTime=0;
	 private int  endTime=0;
	 private long running;
	 
	 public void start()
		{
			startTime=(int) System.currentTimeMillis();
			System.out.println("Start Time is: "+startTime);
	   }
	
	 public void end()
		{
			endTime=(int) System.currentTimeMillis();
			System.out.println("End Time is: "+endTime);
	   }
	 
	 public long RunningTime()
	 {
		 running=endTime-startTime;
		 return running;
		 
	 }
		 
	public static void main(String args[])
	{
		StopWatch s=new StopWatch();
		Utility u=new Utility();
		
		System.out.println("press 1 to start time");
		u.inputInteger();
		s.start();
		
		System.out.println("press 2 to end time");
		u.inputInteger();
		s.end();
		
		long l=s.RunningTime();
		System.out.println();
		System.out.println("Total Time1 Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

		
	}
		
		
		
		
		
		
	}

