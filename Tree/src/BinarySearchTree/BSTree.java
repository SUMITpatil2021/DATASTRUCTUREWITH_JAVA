package BinarySearchTree;

public class BSTree {
	Node root;
	public BSTree()
	{
		root=null;
	}
	
	public void addNode(int data)
	{
	Node n1=new Node(data);
	if(root==null)
	{
		root=n1;
		System.out.println("Root is created !!!");
		return ;
	}
	Node move=root;
	while(true)
	{
	if(move.data>n1.data)
	{  
		if(move.left==null)
		{
			move.left=n1;
			System.out.println("Node is added at left of  "+move.data);
			break;
		}
		else
		{
			move= move.left;
		}
	}
	else
	{
		if(move.right==null)
		{
			move.right=n1;
			System.out.println("Node is added at right of  "+move.data);
			break;
		}
		else
		{
			move=move.right;
		}
	}
	
	}
	} 
// delete node from tree 
	public void deleteNode(int data)
	{
		Node temp=root;
		Node tag = root;
		while(temp!=null&& temp.data!=data)  //searching data in tree
		{
			 tag=temp;
			if(data>temp.data)
			{
				temp=temp.right;
			}
			else
			{
				temp=temp.left;
			}
		}
		
		if(temp.left==null)
		{
			if(tag.data<temp.data)
			{
			tag.right=temp.right;	
			}
			else
			{
				tag.left=temp.right;
			}
		}
		
		if(temp.right==null)
		{
			if(tag.data<temp.data)
			{
			tag.left=temp.left;	
			}
			else
			{
				tag.right=temp.left;
			}
		}
		
		if(temp.left!=null)
		{
			if(temp.right!=null)
			{
				Node tr=temp.right;
				while(tr.left!=null)
				{
					tr=tr.left;
				}
				tr.left=temp.left;
				if(tag.data<temp.data)
				{
					tag.right=temp.right;
				}
				else
				{
					tag.left=temp.right;
				}		
			}
		}
		} 
	
	public boolean searchNode(int data)
	{
		Node temp=root;
	
		while(temp!=null&& temp.data!=data)  //searching data in tree
		{
			
			if(data>temp.data)
			{
				temp=temp.right;
			}
			else
			{
				temp=temp.left;
			} 
			
		}
		
		if(temp!=null)
		{
			return true;
		
		}
		else
		{ 
//			System.out.println("Data is not found !!!!");
			return false;
		}
			
	} 
//  method for finding highest node from tree
	public int highestNode()
	{
		Node tr=root;
		while(tr.right!=null)
		{
			tr=tr.right;
		}
		return tr.data;
	}
	
	// method for finding smaller node from tree
	public int smallestNode()
	{
		Node tr=root;
		while(tr.left!=null)
		{
			tr=tr.left;
		}
		return tr.data;
	}
	
	public int heightofTree(Node move)
	{
		if(move==null)
		{
			return -1;
		}
		int lh=heightofTree(move.left);
		int rh=heightofTree(move.right);
		return lh>rh?lh+1:rh+1;
		
	}
	
	public void levelWisePrint()
	{
		dyanamicQueue c1=new dyanamicQueue();
		if(root==null)
		{
			return;
		}
		c1.enQueue(root);
		c1.enQueue(null);
		
		while(!c1.isEmpty())
		{
		Node temp =c1.deQueue();
		System.out.print(" "+temp);
		
		
		
//		if(temp==null)
//		{
//			System.out.println();
//		}
		
		
		if(temp.left!=null)
		{
			c1.enQueue(temp.left);
		}
		if(temp.right!=null)
		{
			c1.enQueue(temp.right);
		}
		}
		
	}
		
	
	
	public void inOrder(Node move)
	{
			if(move!=null)
			{
				inOrder(move.left);
				System.out.print("\t"+move.data);
				inOrder(move.right);
			}
		
	}
	
	public void preOrder(Node move)
	{
		if(move!=null)
		{
			System.out.print("\t"+move.data);
			preOrder(move.left);
			preOrder(move.right);
		}
	}
	
	public void postOrder(Node move)
	{ 
		if(move!=null)
		{
		postOrder(move.left);
		postOrder(move.right);
		System.out.print("\t"+move.data);
		}
	} 
	
	public void display()
	{
		
		System.out.println();
		System.out.println("********************InOrder*********************");
		inOrder(root);
		System.out.println();
		System.out.println("********************preOrder*********************");
		preOrder(root);
		System.out.println();
		System.out.println("********************postOrder*********************");
		postOrder(root);
		
	}
	
	}

