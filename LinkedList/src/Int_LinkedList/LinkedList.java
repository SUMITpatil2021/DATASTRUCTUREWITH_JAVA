package Int_LinkedList;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}

	public void createLinkedList(int size)
	{
		//int no=5;
		int data=0;
		for(int i=1;i<=size;i++)
		{
			addNode(data);
			//no=no+5;
		}

	}

	public void  addNode(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
		}
		else 
		{
			Node move;
			for(move =head;move.link!=null;move=move.link);
			move.link=record;
		}

	}


	// Delete According to position 
	public void delete(int pos)
	{
		if(pos<=0 || pos>size())
		{
			System.out.println("Invalid position");
		}
		else
		{
			Node move=head;
			Node del;

			if(pos==1)
			{
				 del=head;
				head=head.link;
				del=null;
			}	
			else
			{
				move=head;
//				while(move.link!=null)
//				{ 
					for(int i=1;i<pos-1;i++)
					{
						 
						 move=move.link;	
					}
					del=move.link;
					 move.link=del.link;
						del=null;
					 
				}
			//}
		}

	} 
	
	// delete according to data 
	
	public void deleteData(int data)
	{
		boolean flag=false;
		Node del;
		if(head.data==data)
		{
			del=head;
			head=head.link;
			del=null;
			flag=true;
//			return flag;
		}
		else
		{
			Node move=head;
			while(move.link!=null)
			{
				if(move.link.data==data)
				{
					del=move.link;
					move.link=del.link;
					del=null;
					flag =true;
					break;
				}
				move=move.link;
			}
		}
		if(flag==true)
		{
			System.out.println("Not Present");
		}
	
	}
	

	public void insert(int pos,int data)
	{
		int cnt=size();
		if(pos<=cnt+1 && pos>0)
		{
			Node newnode=new Node(data);
			if(pos==1)
			{
				if(head==null)
				{
					head=newnode;
				}
				else
				{
					newnode.link=head;
					head=newnode;
				}
			}
			else
			{
				Node move=head;
				for(int i=1;i<pos-1;i++)
				{
					move=move.link;
				}
				newnode.link=move.link;
				move.link=newnode;

			}
		}
		else
		{
			System.out.println("Invalid ");
		}
	} 

	public void reverse(Node move)
	{
		if(move!=null)
		{
			reverse(move.link);
			System.out.print(move.data);
//			display();
		}

	} 
	
	public void sortLinkedList()
	{
		Node temp=head;
		Node tag;
		while(temp!=null)
		{
			tag=temp.link;
			while(tag!=null)
			{
				if(temp.data>tag.data)
				{
					int newone=temp.data;
					temp.data=tag.data;
					tag.data=newone;
				} 
				tag=tag.link;
			}
			temp=temp.link;	
		}
		
	} 
	
	public void revereseLinkedList()
	{
		Node p1=head;
		Node p2=p1.link;
		Node p3=p2.link;
		
		while(p2!=null)
		{
		
		p2.link=p1;
		p1=p2;
		p2=p3; 

		if(p3!=null)
		{
			p3=p3.link;
		}
		} 
		head.link=null;
		head=p1;     
	}
		
	


	public int size()
	{
		Node move;
		int count=0;
		for(move=head;move.link!=null;move=move.link)
		{
			count++;

		}
		if(move.link==null)
		{
			count++;
		}
		return count;
	}




	public void display()
	{   
		System.out.println("\n**************Linked List *****************");
		Node move;
		for(move=head;move.link!=null;move=move.link)
		{
			System.out.print("\t"+move.data);
		}
		if(move.link==null) 
		{
			System.out.print("\t"+move.data);
		}

	}

	//	public static void main(String []args)
	//	{
	//		
	//		
	//		l1.createLinkedList(5);
	//		l1.display();
	//		l1.addNode(30);
	//		l1.display();
	//		l1.addNode(35);
	//		l1.display();
	//	}
}

