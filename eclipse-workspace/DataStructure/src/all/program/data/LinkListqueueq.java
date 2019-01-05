/**
* Created by:Rohini Patil
* Date 31/12/2018
* Purpose:Desc ­> Create a Program which creates Banking Cash Counter where people
come in to deposit Cash and withdraw Cash. Have an input panel to add people
to Queue to either deposit or withdraw money and dequeue the people. Maintain
the Cash Balance.
 */

package all.program.data;

import all.program.utility.Utility;

public class LinkListqueueq {
	public static void main(String[] args) {
 
		Utility u=new Utility();
		
		LinkListQueue list=new LinkListQueue();
		LinkListqueueq l=new LinkListqueueq ();
        System.out.println("Enter Initial Amount");
        //accept the input from user
        int balance=u.inputInteger();
        System.out.println("enter number of pepole in list");
        //accept the input fro user
        int persons=u.inputInteger();
        //call the method of counter 
		int amount=list.counter(balance, persons);
        System.out.println("new Balance after Withdrows"+amount);

		
		
		
	}
    
}
