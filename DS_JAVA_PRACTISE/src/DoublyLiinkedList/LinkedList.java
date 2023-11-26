package DoublyLiinkedList;

public class LinkedList {
Node head;
public LinkedList()
{
head=null;	
}

public void addLast(int data)
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



public void addFirst(int data)
{
Node n1=new Node(data);
  if(head==null)
  {
	  head=n1;
  }
  else
  {
	 n1.next=head;
	 head.prev=n1;
	 head=n1;
  }
}

public void addPos(int pos,int data)
{
	Node n1=new Node(data);
	if(pos>=0 && pos < size()-1)
	{
	if(pos==1)
	{
	if(head==null)
	{
		head=n1;
	}
	else
	{
		n1.next=head;
		head.prev=n1;
		head=n1;
	}
	
	}
	
	else
	{
		Node move=head;
		
		for(int i=1;i<pos-1;i++)
		{
			move=move.next;
		}
		n1.next=move.next;
		if(move.next!=null)
		{
			move.next.prev=n1;
		}
		move.next=n1;
		n1.prev=move;
		
		
	}	
	}
	else
	{
		System.out.println("Invalid !!!!");
	}
}


public void delete(int data)
{
	if(head.data==data)
	{
		if(head.next==null)
		{
			head=null;
		}
		else
		{
			head.next.prev=null;
			head=head.next;
		}
		
	}
	else
	{
		Node move=head;
		Node del;
		while(move.next.data!=data)
		{
			move=move.next;
		}
		del=move.next;
		if(del.next!=null)
		{
			del.next.prev=move;
		}
		move.next=del.next;
		del=null;
		
	}
}
public int size()
{
	int  cnt=0;
	Node move=head;
	while(move.next!=null)
	{
		
		move=move.next;
		cnt++;
	}
	if(move.next==null)
	{
		cnt++;
	}
	return cnt;
}

public void display()
{
	System.out.println("**************************** Linked List ***************************************");
Node move=head;
while(move.next!=null)
{
	System.out.print("\t"+move.data);
	move=move.next;
}
if(move.next==null)
{
	System.out.print("\t"+move.data);
}
}
}
