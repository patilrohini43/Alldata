package all.program.data;

public class PalindromeMethod {
	
	public static int palindromeMethod(String str)
	{
		//create the object of palindome 
				PalindromeLogic<Integer> list=new PalindromeLogic<>();
		for(int i=0;i<str.length();i++)
		{
			int c=str.charAt(i);             //get the char
			list.addRear(c);                    //add one by one in list
		
		}

        boolean isPalindrome=true;
      
        
        while (list.size()>1) {
          { 
        	  //check the front rear string is equal or not
    	if(list.removeFront()==list.removeRear())
    	{
    		   // System.out.println(list.removeFront());
                continue;
            } else {
            	
            	  //System.out.println(list.removeRear());
                isPalindrome=false;
                break;
            }
        }
       
        }
        //check the string is palindrome or not
        if (!isPalindrome) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }
		return 0;
	}
	

}
