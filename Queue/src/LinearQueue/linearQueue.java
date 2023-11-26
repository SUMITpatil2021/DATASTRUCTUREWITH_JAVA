package LinearQueue;

public class linearQueue {

	int size,rear,front;
	int arr[];
	public linearQueue()
	{
		size=3;
		rear=front=-1;
		arr=new int[size];
	}
	public linearQueue(int size)
	{
		this.size=size;
		rear=front=-1;
		arr=new int[size];
	}
	public void enQueue(int data)
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

	public int deQueue()
	{
		int data=-9999;
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
	



