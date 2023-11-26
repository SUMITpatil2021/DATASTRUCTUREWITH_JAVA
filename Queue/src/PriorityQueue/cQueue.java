package PriorityQueue;

public class cQueue {
int size,front,rear;
Element arr[];
public cQueue()
{
//	this.size=size;
	arr=new Element[size];
	front=rear=-1;
} 

public boolean isEmpty()
{
	return front==-1?true:false;
}

public boolean isFull()
{
return  rear==size-1?true:false;
}

public void enQueue(Element data)
{
	if(isFull())
	{
		System.err.println("Queue is full !!!");
	}
	else
	{
		if(front==-1)
		{
			front=0;
			rear++;
			arr[rear]=data;
		}
		else
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=front;j<size-1-i;j++)
				{
					if(arr[j].pri< arr[j+1].pri)
					{
						Element temp;
						temp=arr[i];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					
					}
				}
			}
			
		}
		}
	}
public Element deQueue()
{
	Element data=null;
	if(isEmpty())
	{
		System.err.println("Queue is empty !!!");
	}
	else
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
	System.out.println(" ");
	for(int i=front;i<=rear;i++)
	{
		System.out.println(arr[i]+" ");
		System.out.println();
	}
}

}


