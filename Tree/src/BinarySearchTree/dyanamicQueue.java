package BinarySearchTree;

public class dyanamicQueue {
Node front,rear;
int arr[];
public dyanamicQueue()
{
	rear=front=null;
}
//public dyanamicQueue(int size)
//{
//	this.size=size;
//	front=rear=-1;
//	arr=new int[size];
//}
public boolean isEmpty()
{
	return front==null?true:false;
}
//public boolean isFull()
//{
//	return rear==size-1?true:false;
//}

public void enQueue(Node newnode)
{
//	if(!isEmpty())
//	{
		if(rear==null)
		{
			rear=front=newnode;
		}
		rear.next=newnode;
		rear=newnode;
	}

public Node deQueue()
{ 
	
	if(isEmpty())
	{
		System.out.println("Queue is empty"); 
	}
	Node data=front;
	front=front.next;
	
	return data;
}

public void display()
{
	Node move=front;
	while(move!=rear)
	{
		System.out.print(" "+move.data);
		move=move.next;
	}
	System.out.print(" "+move.data);
}
}

