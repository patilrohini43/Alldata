package all.program.data;

import java.util.Stack;

public class Balance {
	public static int balanceExp(String exp)
	{
		//create stack object
				Stack<Integer> stack=new Stack<>();
		//gives string in int
				int len=exp.length();
				
				//start travrse
				for(int i=0;i<len;i++)
				{
					char ch=exp.charAt(i);
					
		            if (ch == '(')    //if opening bracket then push

		                stack.push(i);

		            else if (ch == ')')                //if closing bracket then pop operation

		            {

		                try

		                {

		                    int p = stack.pop();

		                    System.out.println("')' at index "+(i)+" balanced with ')' at index "+p);

		                }

		                catch(Exception e)

		                {

		                   System.out.println("')' at index "+(i)+" is unbalanced");

		                }

		            }            

		        }
		           
				//string is empty or not
		        if(!stack.isEmpty())
		        {

		          // System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		        	System.out.println("the  expression is unbalanced");

		        }
		        else
		        {
		        	System.out.println("the  expression is balanced");
		        }
				return len;

			
	}

}
