package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
Node root;
public BinaryTree()
{
	root=null;
}
//public void addNode(int data)  //------>> Add Node according to user choice  as left or right 
//{
//	Node n1=new Node(data);
//	Scanner sc=new Scanner(System.in);
//			if(root==null)
//			{
//				root=n1;
//				System.out.println("Root created!!!");
//				return;
//			}
//			Node move=root;
//			int ch;
//			while(true)
//			{
//				System.out.println("WHere to attach n node [0.add right side 1.add left side]");
//				ch=sc.nextInt();
//				if(ch==1)
//				{
//			if(move.left==null)
//			{
//				move.left=n1;
//				System.out.println("Node added at left of "+move.data);
//				break;
//			}
//			else
//			{
//				move=move.left;
//			}
//			}
//				else if(ch==0)
//				{
//					if(move.right==null)
//					{
//						move.right=n1;
//						System.out.println("Node added at right of "+move.data);
//						break;
//					}
//					else
//					{
//						move=move.right;
//					}
//				}
//				else
//				{
//					System.out.println("Invalid choice!!!");
//					break;
//				}
//			}			
//}

public void addNode(int data) // ------->> Add Node  in sorted Manner automatically in left-right manner 
{
	Node n1=new Node(data);
	if(root==null)
	{
		root=n1;
		System.out.println("Root created !!!");
		return;
		
	}
	Node move=root;
	while(true)
	{
		if(move.data>n1.data)
		{
			if(move.left==null)
			{
				move.left=n1;
				System.out.println("Node is attached at left side of "+move.data);
				break;
			}
			else
			{
				move=move.left;
			}
		}
		else
		{
			if(move.right==null)
			{
				move.right=n1;
				System.out.println("Node is attched at right side of "+move.data);
				break;
			}
			else
			{
				move=move.right;
			}
		}
	}
}

public void deleteNode(int data)
{
	Node temp=root;
	Node tag=root;
	while(temp!=null & temp.data!=data)
	{
		tag=temp;
		if(temp.data<data)
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
	if(temp.left!=null && temp.right!=null)
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

public int higherNode()
{
	Node move=root;
	while(move.right!=null)
	{
		move=move.right;
	}
	return move.data;
}



public int smallerNode()
{
	Node move=root;
	while(move.left!=null)
	{
		move=move.left;
	}
	return move.data;
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
	System.out.println("*************************Inorder ***********************************");
	inOrder(root);
	System.out.println();
	System.out.println("*************************Preorder ***********************************");
	preOrder(root);
	System.out.println();
	System.out.println("*************************Postorder ***********************************");
	postOrder(root);
}
}
