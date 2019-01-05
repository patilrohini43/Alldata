package all.algo.program;

import all.program.utility.Utility;

public class TaskScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("Enter the Number of Taks");
        int task=u.inputInteger();
        int[] min=new int[task];
        int[] deadline=new int[task];
        for(int i=0;i<min.length;i++)
        {
        	System.out.println("task"+i+"time");
        	min[i]=u.inputInteger();
        	System.out.println("task"+i+"deadline");
        	deadline[i]=u.inputInteger();
        }
        
        

	}

}
