package LinearQueue;

public class lQueue {
int size,front,rear;
int arr[];
public lQueue()
{
	front=rear=-1;
	size=3;
	arr=new int[size];
}
public lQueue(int size)
{
	this.size=size;
	front=rear=-1;
	arr=new int[size];
}
public boolean isEmpty()
{
	return front==-1?true:false;
}
public boolean isFull()
{
	return rear==size-1?true:false;
}

public void enQueue(int data)
{
	if(!isEmpty())
	{
		if(front==-1)
		{
			front=0;
		}
		rear++;
		arr[rear]=data;
		}
	}

public int deQueue()
{ 
	int data=0;
	if(!isFull())
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

public void display()
{
	for(int i=front;i<=rear;i++)
	{
		System.out.print("\t"+arr[i]);
	}
}
}

