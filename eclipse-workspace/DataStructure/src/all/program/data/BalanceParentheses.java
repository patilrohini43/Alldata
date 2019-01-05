/*
* Created by:Rohini Patil
* Date 31/12/2018
* Purpose:Desc ­> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
**/

package all.program.data;

import java.util.Stack;

import all.program.utility.Utility;

public class BalanceParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility u=new Utility();
		//accept the value from user
		/**
		System.out.println("Enter the value You Want");
		int num=u.inputInteger();
		**/
		//create stack object
		Stack<Integer> stack=new Stack<>();
		
		//enter the expression from user
		System.out.println("Enter Expression");
		String exp=u.inputString();
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

	}
}
		
		
		
		
		

	


