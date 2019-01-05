
package all.program.data;

public class PalindromeLogic<T> {
	
	//create node class
	public class Node<T>
	{ 
		T data;
        private Node next;
        private Node pre;
	
	//create node constructor
	 public  Node(T data){
         this.data=data;
     }
	}

	//create node front and rear
	public Node front;               
	public Node rear;	
	int size=0;

	//if queue is empty 
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else
		
		return false;
	}
	
	//method for add element in front of queue
	public void addFront(T val)
	{
		//if queue is empty
		if(front==null)
		{
			front.data=val;
			rear=front;
			
		}//if queue is not empty then
		else
		{
			Node<T> node=new Node(val);               //create node class object assign the value
 			node.data=val;                         //assign value to data
			node.next=front;                     //the front value is assign to node next
			front.pre=node;                      //then node which is stored in previous 
			front=node;                          //the node value is assign to front 
		}
          size++;             
		
	}
		
		
		
	
	//add the elements in rear 
	public void addRear(T val)
	{
		//if queue is empty
		if(front==null)
		{   Node<T> node=new Node(val);
			front=node;
			rear=front;
			
		}
		//if queue is not empty
		else
		{
			Node<T> node=new Node(val);            //create node class object and assign the value to node
			rear.next=node;                              //the node value stored in rear.next
			                                              //then rear value is assign to prevoius node
			node.pre=rear;                                //the node value is added at rear
			rear=node;
		}
           size++;
		}
	
	

	
	//remove element at front of queue
		public T removeFront()
		{
			T val=null;
			//if queue is empty
			if(front==null)
			{
				System.out.println("No elements to delete");
			}
			//if queue is not empty
			else
			{
				val=(T) front.data;
				front=front.next;
			}
			size--;
			return val;
		}
		
		//remove element at rear
		public T removeRear()
		{
			T val=null;
			//if queue is empty
			if(front==null)
			{
				System.out.println("No element to delete");
			}
			//if queue is not empty
			else
			{
				val=(T) rear.data;
				rear=rear.pre;
				rear.next=null;
			}
			size--;
			return val;
		}

	
		//return the size
	public int size()
	{
		return size;
		
	}
	
	
	
	
	
	
}


