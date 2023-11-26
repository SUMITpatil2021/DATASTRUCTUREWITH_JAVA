package StackWithLinkedList;



public class Stack {
	Node top;
	public Stack()
	{
		top=null;
	}
	public void push(int data)
	{
		Node n1=new Node(data);
		if(top==null)
		{
			top=n1;
		}
		else
		{
			n1.next=top;
			top=n1;
		}
	}
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int pop()
	{  int data;
		if(!isEmpty())
	   {
		  data=top.data;
		  top=top.next; 
		  return data;
	   }
	   else
	   {
		  throw new StackisEmptyException("Stack is empty");
		   
	   }
	}
	

public void display()
{
	System.out.println("\n************** Stack with Linked List *****************");
	Node move;
	for(move=top;move.next!=null;move=move.next)
	{
		System.out.print("\t"+move.data);
	}
	if(move.next==null)
	{
		System.out.print("\t"+move.data);
	}	 
} 
}

