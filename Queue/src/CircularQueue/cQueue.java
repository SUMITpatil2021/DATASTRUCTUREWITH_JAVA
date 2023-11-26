package CircularQueue;

public class cQueue {
	private int size,rear,front;
	private int arr[];
	public cQueue()
	{
		rear=front=-1;
		size=3;
		arr=new int[size];
	}
	public cQueue(int size)
	{
		rear=front=-1;
		this.size=size;
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
				rear=(rear+1)%size;
				arr[rear]=data;
			
		}
		else
		{
			System.out.println("Queue is full ");
		} 
		System.out.println("rear"+rear);
		System.out.println("Front"+front);
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
				front=(front+1)%size;
			}
		}
		
		return data;
	}
	private boolean isFull()
	{
		if(front==(rear+1)%size)
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
		int i;
		for( i=front;i!=rear;i=(i+1)%size)
		{
			System.out.print("\t"+arr[i]);
			
			}
		if(i==rear)
		{
			System.out.println("\t"+arr[i]);
		}

		}
	}

	

