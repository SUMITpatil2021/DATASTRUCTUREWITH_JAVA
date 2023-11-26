package AdjacencyList;

public class LinkedList {
Node head;
public LinkedList()
{
	head=null;
	
}
public void addBeg(int data)
{
	Node n1=new Node(data);
	if(head==null)
	{
		head=n1;
		
	}
	else
	{
		
		n1.next=head;
		head=n1;
	}
}

public void display()
{
	Node move=head;
	while(move!=null)
	{
		System.out.println("\t"+move.data);
		move=move.next;
	}
}
}
