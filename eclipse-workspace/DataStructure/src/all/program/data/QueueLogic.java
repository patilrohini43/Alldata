package all.program.data;

public class QueueLogic<T> {
	
	Node first;
	public QueueLogic()
	{
		first=null;
	}
	
	class Node<T>{
		T data;
		Node next;
		
		public Node(T key)
		{
			data=key;
			next=null;
			
		}
		
		public void displayNode()
		{
			System.out.println(data);
		}
	}
	
	public void insert(T i)
	{
		Node newNode=new Node(i);
		
		//if is empty
		if(first==null)
		{
			return;
		}
		
		//if list is not empty
		
		Node tempNode=first;
		while(tempNode.next!=null)
		{
			tempNode=tempNode.next;     //incerement node value
			
		}
		tempNode.next=newNode;    //assign the new value to tempnode
		
	}
	
	
	
	//starting position of node
	public Node remove() {
		Node temp=first;       //assign the first value to temp
		first=first.next;      //increment the first
		return temp;              //retun temp value
		
	}

	
	//display the value to node
	public void display()
	{
		Node tempNode=first;
		while(tempNode!=null)
		{
			tempNode=tempNode.next;    //inc
			
		}
		
		System.out.println();
	}
	
	
	
	
}
