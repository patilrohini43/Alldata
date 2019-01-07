package all.program.data;

public class LinkedList<T> {
	
	//create the node class
	 private static class Node<T> {

	        private T data;
	        private Node next;
	        private Node pre;

	        public Node(T data){
	            this.data=data;
	        }


	        public void displayNode(){
	            System.out.print(data+ " ");
	        }

	    }

	    private Node first = null;
	    private Node last = null;
	    int size=0;

	    //check the queue is empty or not
	    public boolean isEmpty() {
	        return (first == null);
	    }

	    //create the queue for inserting at rear
	    public <T> void addLast(T data) {
	    	//create node object
	        Node n = new Node(data);
	        //check if queue is empty
	        if (isEmpty()) {
	            n.next = first;
	            first = n;
	            last = n;
	            //if queue is not empty
	        } else {
	            last.next = n;
	            last = n;
	            last.next = null;
	        }

	    }
	    
	    /**
	    public<T>void addFirst(T val)
	    
	    {
	    	if(first==null)
	    	{
	    		first.data=val;
	    		last=first;	
	    		
	    	}
	    	else
	    	{
	    		Node<T> tNode=null;
				tNode.data=val;
				tNode.next=first;
				first.pre=tNode;
	           first=tNode;
	    	}
	    }
	   
	    
	  **/

	    
	    //use for remove the data in queue
	    public void removeFirst() {

	            Node temp = first;   //assign the node value of first to temp
	            if (first.next == null)
	                last = null;
	            first = first.next;     //increment the value of first
	            

	        }
	    
	    /**
	 public <T> T removeLast()
	 {
		 T val=null;
	
			if(first==null)
			{
				System.out.println("No element to delete");
			}
			else
			{
				
				val=(T) last.data;
				last=last.pre;
				last.next=null;
			}
			
			size--;
	   return val;
		 
		 
	 }
	 **/

	    //display list
	    public void displayList() {
	        Node current = first;             //assign the first node value to current
	        while (current != null) {               //if current value is not equal to null then
	            current.displayNode();        //display node 
	            current = current.next;    //increment next pointer
	        }
	    }

	    public int size() {
			return size;
	    	
	    }
	    
	  //create the queue for inserting at rear
	    public <T> boolean enqueue(T data) {
	    	//create node object
	        Node n = new Node(data);
	        //check if queue is empty
	        if (isEmpty()) {
	            n.next = first;
	            first = n;
	            last = n;
	            //if queue is not empty
	        } else {
	            last.next = n;
	            last = n;
	            last.next = null;
	        }
			return true;

	    }
	    
	    
	    
	    //use for remove the data in queue
	    public boolean dequeue() {

	            Node temp = first;   //assign the node value of first to temp
	            if (first.next == null)
	                last = null;
	            first = first.next;     //increment the value of first
				return true;
	            

	        }
	    
	    
	    

	 
	    
	

}
