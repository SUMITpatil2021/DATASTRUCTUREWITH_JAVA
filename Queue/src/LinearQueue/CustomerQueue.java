package LinearQueue;

public class CustomerQueue {

	int size,rear,front;
	Customer arr[];
	public CustomerQueue()
	{
		size=3;
		rear=front=-1;
		arr=new Customer[size];
	}
	public CustomerQueue(int size)
	{
		this.size=size;
		rear=front=-1;
		arr=new Customer[size];
	}
	public void enQueue(Customer data)
	{
		if(!isFull())
		{
			if(front==-1)
			{
				front=0;
			}
				rear=rear+1;
				arr[rear]=data;
			
		}
		else
		{
			System.out.println("Queue is full ");
		}

	}

	public Customer deQueue()
	{
		Customer data=null;
		if(!isEmpty())
		{
			data=arr[front];

			if(front==rear)
			{
				front=rear=-1;
			}
			else
			{
				front++;
			}
		}
		
		return data;
	}
	private boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	private boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}

	
	
	
	
}
