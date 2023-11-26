package DoublyLiinkedList;

import java.util.Scanner;

public class LinkedList {
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	public LinkedList(int terms)
	{ 
		int data;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=terms;i++)
		{
			System.out.println("Enter Data");
			data=sc.nextInt();
			addNode(data);
		}

	}
// add at last 
	public void addNode(int data)
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
 
	// add at first 
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
	
	// add at position 
	public void insert(int pos,int data)
	{
		if(pos>0 && pos<size()+1)
		{
			Node n1=new Node(data);
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
				if(n1.next!=null)
				{
					move.next.prev=n1;
				}
				move.next=n1;
				n1.prev=move;

			}
		}
		else
		{
			System.out.println("Invalid Position !!!");
		}

	} 

	// delete data according to data 
	public void deleteData(int data)
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

	// Modify data 
	public void modifyData(int data)
	{

	} 

	public void reverese()
	{
		Node move=head;
		while(move.next!=null)
		{
			move=move.next;
		}
		while(move!=head)
		{
			System.out.println(move.data);
			move=move.prev;
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
