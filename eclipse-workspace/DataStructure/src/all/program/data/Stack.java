package all.program.data;

public class Stack<T> {
	
	//create the size of stack
	int[] stack=new int[20];
	//declare the top  
  int top=1;
	
  //the element is inserted use push operation
	public void push(int data)
	{
		
		stack[top]=data;                    //the data is stored in stack of top
		top++;                               //top is increment
		
	}
	
	//the element is deleted in the stack use pop operation
	public int pop()
	{
	
		int data;                         
		top--;                                //top is decrement
		data=stack[top];                       //stack of top values is stored in data
		//stack[top]=0;                            
		return data;                                  //return the data     
		
	}
	
	//peek operation is the element is present at stack of top
	public  int peek()
	{
		int data;             
		
		data=stack[top];                             //stack of top elements is stored in data
	                                                    //return data
		return data;
	}
	
	//show method
	public void show()                    

	{
		for(int n:stack)
		{
			System.out.println(n+"");
		}
	}
	
	
	
	//check stack is empty or not
	public boolean isEmpty()
	{
		if(stack[top]==-1)
		{
			return true;
		}
		else
		{
	
		return false;
		}
	}
	
	//the element is inserted use push operation
		public boolean push1(int data)
		{
			
			stack[top]=data;                    //the data is stored in stack of top
			top++;                               //top is increment
			return false;
			
		}
	
}
