/**Created by:Rohini Patil
* Date 5/01/2019
* Purpose:Desc ­>Create the Week Object having a list of WeekDay objects each storing the day (i.e
S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are stored in a Queue
implemented using Linked List.
 */

package all.program.data;

import all.program.utility.Utility;

public class CalenderUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Utility u=new Utility();
				CalenderMethod  cal=new CalenderMethod ();
				
				System.out.println("Enter month between 1 to 12");
				String month=u.inputString();

			    
			    System.out.println("Enter Year");
			    int year=u.inputInteger();
			   // cal.leapYear(year);
			    
			    System.out.print("Enter the week day name (e.g. Sunday) of 1st day of "+month+" : ");
		        String day = u.inputString();
			    
			    int max=cal.findMaxDay(month, year);
			    int f=cal.findDay(day);
			    cal.fillCalendar(max, f, month, year);
			    

	}

}
