package all.program.data;


import java.lang.Iterable;
import java.util.*;
 
class CalQueue<T> 
{
  private Node front, rear; //begin and end nodes
  private int size; // number of items
 
  //nested class to define node
  private class Node
  { 
    T item;
    Node next;
  }
 
  //Zero argument constructor
  public CalQueue()
  {
    front = null;
	rear = null;
    size = 0;
  }
 
  public boolean isEmpty()
  {
    return (size == 0);
  }
 
  //Remove item from the beginning of the list.
  public T delete()
  {
    T item = front.item;
    front = front.next;
    if (isEmpty()) 
    {
      rear = null;
    }
    size--;
    return item;
  }
 
  //Add item to the end of the list.
  public int insert(T item)
  {
    Node oldRear = rear;
    rear = new Node();
    rear.item = item;
    rear.next = null;
    if (isEmpty()) 
    {
      front = rear;
    }
    else 
    {
      oldRear.next = rear;
    }
    return size++;
  }
 
  public int size()
  {
    return size;
  }
 
  //Iterator for traversing queue items
  public Iterator<T> iterator()
  {
    return new LinkedQueueIterator();
  }
 
  //inner class to implement iterator interface
  private class LinkedQueueIterator implements Iterator <T>
  {
    private int i = size;
    private Node first = front; //the first node
 
    public boolean hasNext()
    {
      return (i > 0);
    }
 
    public T next()
    {
     T item = first.item;
      first = first.next;
      i--;
      return item;
    }
 
    public void remove()
    {
      // not needed
    }
  }
}