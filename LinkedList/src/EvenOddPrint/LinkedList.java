package EvenOddPrint;



public class LinkedList {
Node head;
public LinkedList()
{
	head=null;
}
public void  addNode(int data)
{
	Node n1=new Node(data);
	if(head==null)
	{
		head=n1;
		
	}
	else
	{
		Node move=head;
		while(move.next!=null)
		{
			move=move.next;
		}
		move.next=n1;
		

	}
} 

public void eveOdddisplay()
{ 
	
	System.out.println("*********************Even Odd Display*************************");
	Node move=head;
	while(move!=null)
	{
		if(move.data%2==0)
		{
			System.out.print("\t"+move.data);
		}
		
		move=move.next;
	} 
	move=head;
	while(move!=null)
	{
		if(move.data%2!=0)
		{
			System.out.print("\t"+move.data);
		}
		
		move=move.next;
	} 	
}

public LinkedList trim(LinkedList l1,int pos,int element)
{
	LinkedList l2=new LinkedList();
	Node move=head;
	while(move!=null)
	{ 
		int pos=l1.
	for(int i=)
	{
		
	}
	}
			
}

public void display()
{   
	System.out.println("\n**************Linked List *****************");
	Node move;
	for(move=head;move.next!=null;move=move.next)
	{
		System.out.print("\t"+move.data);
	}
	if(move.next==null) 
	{
		System.out.print("\t"+move.data);
	}

} 

public int size()
{
	Node move;
	int count=0;
	for(move=head;move.next!=null;move=move.next)
	{
		count++;

	}
	if(move.next==null)
	{
		count++;
	}
	return count;
}
}
