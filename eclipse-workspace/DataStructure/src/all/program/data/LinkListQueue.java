package all.program.data;

import all.program.utility.Utility;

public class LinkListQueue<T> {

    LinkedList newLinkList = new LinkedList();
   
    //method of insert 
    public <T> boolean enqueue(T data) {
        newLinkList.addLast(data);
		return true;
    }
    
    
/**
    //method of insert 
    public <T> void enqueueLast(T data) {
        newLinkList.addFirst(data);
    }
**/
    //method of delete
    public boolean dequeue() {
        if(!newLinkList.isEmpty())
            newLinkList.removeFirst();
		return true;

    }

    
/**
    //method of delete
    public void dequeueLast() {
        if(!newLinkList.isEmpty())
            newLinkList.removeLast();

    }
    **/
    //method of display
    public void displayQueue() {
        newLinkList.displayList();
        System.out.println();
    }

    public boolean isEmpty(){
        return newLinkList.isEmpty();
    }
    
   
    public int size()
    {
		return newLinkList.size();
    	
    }
    
    
    public static int counter(int balance,int persons)
	{

	
	LinkListQueue list= new LinkListQueue();
	Utility u=new Utility();
    int newbalance=0;
    int count=1;
    int ch=0;
	while(persons!=0 && balance >0)
	{ 
		System.out.println();
	   	System.out.println("------------Banking Cash Counter-----------");
	   	System.out.println("1.Deposit");
	   	System.out.println("2.Withdraw");
	   	System.out.println("3.Exit");
	   	System.out.println();
	   	System.out.println("Enter your choice: ");
	   	int choice=u.inputInteger();
	   	int amount=0;
	   
	   	switch (choice) 
	   	{
	   	case 1:
		   		System.out.println("Enter the amount you want to Deposit");
		   		amount=u.inputInteger();
		   		list.enqueue(amount);
		   		balance=balance+amount;
		   		System.out.println("Amount in bank"+balance);
		   		persons--;
		   		count++;
		   		list.displayQueue();
		   		break;
	   	case 2:
		   		System.out.println("Enter the amount you want to Withdraw ");
		   		amount=u.inputInteger();
		   		list.enqueue(amount);
		   		balance=balance-amount;
		   		System.out.println(" Your Available Balance is: "+balance); 
			
			persons--;
		   		count++;
		   		
		   		list.displayQueue();
		   		break;
		//case 3:
				//int j=list.getSize();
				//System.out.println("The Number of People in Queue is: "+j);			
	   	case 3:
		   		System.exit(0);
	   	default: 
		   		System.out.println("You entered wrong choice");
		   		break;
	   	}
   	}
	
	return balance;


}

}

