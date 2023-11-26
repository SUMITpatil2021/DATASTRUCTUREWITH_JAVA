package SinglyCircularLinkedList;

import java.util.Scanner;

public class LinkedList {
Node head;
public LinkedList()
{
head=null;
}
public void  createLinkedList(int terms)
{ 
	int data;
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=terms;i++)
	{
		System.out.println("Enter Data");
		data=sc.nextInt();
		addEnd(data);
	}

}
 
public void addFirst(int data)
{
	Node n1=new Node(data);
	Node move;
	if(head==null)
	{
		head=n1;
//		n1.next=head;
	}
	else
	{
		n1.next=head;
		
		for( move=head;move.next!=head;move=move.next);
		move.next=n1;
		head=n1;	
	}
}

public void  addMid(int pos,int data)
{
	Node  newnode=new Node(data); 
	Node move=head;
	int cnt=size();
	if(pos>0 && pos<=size()+1)
	{
		if(pos==1)
		{
			addFirst(data);

		}
		else if(pos==cnt+1)
		{
			addEnd(data);
		}
		else
		{
			for(int i=1;i<=pos-1;i++)
			{
				move=move.next;
			}
			newnode.next=move.next;
			move.next=newnode;
		}
	} 
	else
	{
		System.out.println("Invalid Position ");
	}
} 

public void addEnd(int data)
{
	Node newnode =new Node(data);
//	Node move;
	if(head==null)
	{
		head=newnode;
		newnode.next=head;
		
	}
	else
	{
	Node move=head;
	while(move.next!=head)
	{
		move=move.next;
	}
	move.next=newnode;
	newnode.next=head;
	
	
	}
	
}

public int size()
{
	int count=0;
	Node move=head;
	while(move.next!=head)
	{
		count++;
	}
//	if(move.next==null)
//	{
//		count++;
//	}
	
	return count;
}

public void display()
{
  Node move=head;
  System.out.println("*****Linear Circular LinkedList*****");
  
	
	  while(move.next!=head )
	  {
	  System.out.print(move.data+" ");
	  move=move.next;
	  
  }
 
		System.out.print("\t"+move.data);
	System.out.println();
	 
}
}
