package DoubleEndedQueue;

public class cQueue 
{
	Node rear,front;
	public cQueue()
	{
		rear=front=null;
	}

	public boolean isEmpty()
	{
		return front==null  && rear==null?true:false;
	}

	public void enQueueFront(int data)
	{
		Node newnode=new Node(data);
		if(front ==null &&rear==null )
		{
			rear=front=newnode;
		}
		else
		{
			newnode.next=front;
			front=newnode;
		}
	}

	public void enQueueRear(int data)
	{
		Node newnode=new Node(data);
		if(front ==null && rear==null)
		{
			rear=front=newnode;
		}

		rear.next=newnode;
		rear=newnode;
	}

	public int deQueueFront()
	{   int data=0;
	if(isEmpty())
	{
		System.err.println("Queue is Empty!!!");
	} 
	else
	{
		data=front.data;
		front=front.next;
	}
	return data;	
	}

	public int deQueueRear()
	{  
		int data = 0;
		if(isEmpty())
		{
			System.err.println("Queue is Empty!!!");
		}
		else 
		{
			if(rear.next==null && front.next==null)
			{
				data=rear.data;
				rear=front=null;
				return data;
			}
			Node move=front;
			while(move.next.next!=null)
			{
				move=move.next;
			}
			data=rear.data;
			rear=move;
			rear.next=null;
			
		}
		return data;

	}
	public void display()
	{ 
		if(!isEmpty())
		{
			Node move=front;
			System.out.println();
			while(move!=null)
			{
				System.out.print("\t"+move.data);
				move=move.next;

			} 
			System.out.println();


		}
	}
}
