package com.bridgeLabz.stock1;

public class StackList<T> {

Node head;
int length = 0 ;
int top = -1;
static class Node<T>
{
	T data;
	Node<T> next;
 Node(T data)
 {
	this.data =data;
	this.next = null;
 }
}
public StackList()
{
	
}
//===================================push element in stack===========================================================
 public boolean push(T data)
 {
	 Node<T> new_node = new Node(data);
	 if(head == null)
	 {
		 head = new_node;
		 length++;
		 return false;
	 }
	 new_node.next = head;
	 head = new_node;
	 length++;
	return true;
	
 }
//=====================================check my stack is empty or not=======================================================
 public boolean isEmpty()
 {
	 return (head==null);
 }
//=============================for Last in first out==================================================================
 public Stocks pop()
 {
	 Node current = head;
	 head = current.next;
	 length--;
	return null;
 }
//==============================check size of stack===============================================
 public int size()
 {
	return length;
 }
//===============================print stack===============================================================
 public void display()
 {
	 int size = size();
	 
	 int count = 0;
	 Node current = head;
	 for(int i = 0; i< size;i++)
	 {
		
		 System.out.println(current.data);
		 current = current.next;
	 }
 }
//================================return top element in stack======================================================
 public <T>  T peek()
 {
	if(head.data == null)
	{
		System.out.println("no element present");
		return null;
	}
	 return (T) head.data;
 }

 public boolean push1(T data) {
		Node temp = head;
		Node n = new Node(data);
		if(head == null) {
			head = n;
			return true;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			return true;
		}
	}
	
	public T pop1() {
		Node temp = head, temp1;
		if(head == null) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			if(temp.next == null) {
				head = null;
				return (T) temp.data;
			}
			else {
				while(temp.next.next != null)
					temp = temp.next;
				temp1 = temp.next;
				temp.next = null;
				return (T) temp1.data;
			}
		}
	}
 public String toString()
 {
	 Node temp=head;
	 String string="";
	 while(temp!=null)
	 {
		 string=string+temp.data;
		 if(temp.next!=null)
		 {
			 string=string+",";
			 temp=temp.next;
		 }
		
		 }
	return string;
	 }
 
}
