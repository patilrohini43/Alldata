/*
*Created by:Rohini Patil
* Date 13/12/2018
* Purpose:Relace String
**/


package all.program.com;



import all.program.utility.Utility;

public class Replace {
	
  public static void main(String args[])
  {
	  
  /**
   * Create the object of Utility to call the function
   */
	Utility u=new Utility();
	
	System.out.println("Enter The String You Want");
	String str=u.inputString();
	
	System.out.println("Enter search name character ");
	String search=u.inputString();
	
	System.out.println("Enter Replace name charatcter");
	String replace=u.inputString();
	
	
	
	
	// show result
	 
	System.out.println("Result = " + u.result(str, search, replace));
	


	
}
}