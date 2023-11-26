package String_LinkedList;



public class LinkedList {
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	
	public void createLinkedList(int size)
	{
		String string="\0";
		for(int i=1;i<=size;i++)
		{
			addEnd(string);
		}
	}
	public void addEnd(String str)
	{
		Node record=new Node(str);
		if(head==null)
		{
			head=record;
		}
		else
		{
		Node move;
		for(move=head;move.getLink()!=null;move=move.link);
//		move.getLink()=record;
		move.link=record;
		}
	}
		
		public void addBeg(String str)
		{
			Node record=new Node(str);
			if(head==null)
			{
				head=record;
			}
			else
			{
				record.link=head;
				head=record;
			}
			
		}
		
		public void modifyDirect(int pos,String newstring)
		{
			if(pos<=0 || pos>size())
			{
				System.out.println("Invalid size ");
			}
			else
			{
				Node move=head;
				for(int i=1;i<pos;i++) 
				{
					move=move.link;
					
				}
				move.str=newstring;
			}
				
		} 
		
		public void modify(String str1,String str2)
		{ 
		} 
		
		public int size ()
		{
			Node move;
			int count=0;
			for(move=head;move.link!=null;move=move.link)
			{
				System.out.println("\t "+move.str);
				count++;
			}
			if(move.link==null)
			{
				System.out.println("\t "+move.str);
				count++;
			}  
//			System.out.println("Size of LinkedList is : "+count);
			return count;
		}
		
		public void display()
		{
			System.out.println("\n**************Linked List *****************");
			Node move;
			for(move=head;move.link!=null;move=move.link)
			{
				System.out.println("\t "+move.str);
			}
			if(move.link==null)
			{
				System.out.println("\t "+move.str);
			}
		}
		}
		
	

