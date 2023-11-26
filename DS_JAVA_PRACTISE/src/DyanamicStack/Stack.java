package DyanamicStack;

public class Stack {
Node top;
public Stack()
{
	top=null;
}

public boolean isEmpty()
{
	return (top==null)?true:false;
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
 
public int pop()
{
	int data=0;
	if(!isEmpty())
	{
		data=top.data;
		top=top.next;	
	}
	else
	{
		System.out.println("Stack is Empty!!!!");
	}
	return data;
}
public void display()
{
	System.out.println("****************************** Stack ********************************************");
	Node move=top;
	while(move.next!=null)
	{
		System.out.print("\t"+move.data);
		move=move.next;
	}
	if(move.next==null)
	{
		System.out.print("\t"+move.data);
	}
	
//	for(move=top;move.next!=null;move=move.next)
//	{
//		System.out.print(move.data+"\t");
//	}
//	if(move.next==null)
//	{
//		System.out.println(move.data+"\t");
//	}
}
}
