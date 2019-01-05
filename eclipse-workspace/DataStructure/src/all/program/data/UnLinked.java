package all.program.data;

import all.program.data.Linked.Node;

public class UnLinked<T>{
	Node head; // head node 
	int length;
	class Node<T>
	{
		T data;
		Node next;           // object of class Node for pointing next node 
		public Node(T data)  // constructor for initializing the object
		{
			this.data = data; 
			next =null;      // by  default we providing value as null
		}
		
	}
	int size = 0;
	
//============================add======================================================================
	
	/**
	 * function to add a new item in the list and returns nothing
	 * 
	 * @param data the item which to be added
	 */
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>> void add(T data)
	{
		Node new_node = new Node(data);
		Node temp = head;
		Node prev = temp;
		if(head == null)
		{
			head = new_node;
			length++;
			return;
		}
		if(((T)head.data).compareTo(data)>0)
		{
			new_node.next = head;
			head = new_node;
			length++;
			return;
		}
		while(temp.next != null)
		{
			prev = temp;
			temp = temp.next;
			
			if(((T)temp.data).compareTo(data)>0)
			{
				prev.next =new_node;
				new_node.next =temp;
				length++;
				return;
			}
			
			
		}
		if(temp.next== null)
		{
			temp.next = new_node;
		}
	}
	
//===============================remove===============================================
	/**
	 * Function to remove the item from the list
	 * 
	 * @param item
	 */
	public void remove(T data) {
		Node n = head;
		Node prev = null;
		Node temp = head;
		if (head.data.equals(data)) 
		{
			head = head.next;
			size -= 1;
			return;
		} 
		while(temp.next != null)
		{
			prev = temp;
			temp = temp.next;
			if(temp.data.equals(data))
			{
				prev.next = temp.next;
				break;
			}
		}
		
		
	}

	/**
	 * function to search the item in the list
	 * 
	 * @param item the item to be searched
	 * @return true if found and false if not found
	 */
	public boolean search(T item) {
		Node n = head;
		while (n != null) {
			if (n.data.equals(item)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	

	

	/**
	 * Function to return the index of the item assuming it is present
	 * 
	 * @param item the item to return the index of
	 * @return the index of the passed item
	 */
	public int index(T item) {
		int index = 0;
		Node n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}




	/**
	 * method to show the items in the list
	 */
	public void show() 
	{
		Node new_node = head;
		int size = length();
		System.out.print("[");
		for(int i =0 ; i < size; i++)
		{
			if(new_node.next != null)
			{
			System.out.print(new_node.data+", ");
			new_node = new_node.next;
			}
			else
			{
			System.out.print(new_node.data+"");
		}
		}
		System.out.print("]");
		
		return;
	}
	
	

public int length()              // find length
{
	int length =1 ;
	Node new_node = head;
	if(head == null)
	{
		
		return 0;
	}
		while(new_node.next != null)
	{
		length++;
		new_node = new_node.next;
	}
		
	return length;
}


public void pop(T data)// remove last element  
{
	Node temp = head;
	Node prev = temp;
	if(head == null)
	{
		System.out.println("not any element present for pop");
		return ;
	}
	while(temp.next != null)
	{
		prev =temp;
		temp = temp.next;
	}
	prev.next = null;
}




public boolean isEmpty()
{
	return(length == 0);
}
//===================================find length========================================================================================================
public int size()
{
	return length;
}



public <T>T get(int position)
{
	Node new_node = head;
	int count = 1;
	if(position == 1)
	{
		return (T) new_node.data;
	}
	T element;
		while(new_node.next != null)
		{
		new_node = 	new_node.next;
		count++;
		if(count == position)
		{
			element =  (T) new_node.data;
			return element;
		}
		}
	return null ;
}
}