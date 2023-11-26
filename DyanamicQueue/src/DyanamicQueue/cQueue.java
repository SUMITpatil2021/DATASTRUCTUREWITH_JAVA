package DyanamicQueue;

public class cQueue {

	Node rear,front;
	public cQueue()
	{
		rear=front=null;
	}

	public boolean isEmpty()
	{
		return rear==null?true:false;
	}



	public void enQueue(int data)
	{

		Node newnode=new Node(data);
		if(rear==null)
		{
			rear=front=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
	}
	public int deQueue()
	{
	  if(isEmpty())
	  {
		  System.err.println("Queue is Empty!!!!");
	  }
	 
		  int data=front.data;
		  front=front.next;
		  return data;
	  
	}
	
	public String toString()
	{
		String str=" ";
		Node move=front;
		while(move!=rear)
		{
			str+=move.data;
			move=move.next;
		}
		str+=move.data;
		return str;
	}
}

