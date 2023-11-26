package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
	Node root;
	public BinaryTree()
	{
		root=null;
	}

	public void addNode(int data)
	{
		Node n1=new Node(data);
		Scanner sc=new Scanner(System.in); 
		if(root==null)
		{
			root=n1;
			System.out.println("Root created !!!");
			return;
		}
		Node move=root;
		int ch;
		while(true)
		{  
			System.out.println("Data is to be added at left or right  [0.for add at right 1. for add at left]");
			ch=sc.nextInt();
			if(ch==1)
			{ 
				if(move.left==null)
				{
					move.left=n1;
					System.out.println("Node is added at left of  "+move.data);
					break;
				}
				else
				{
					move=move.left;
				}
			}
			else if(ch==0)
			{  
				if(move.right==null)
				{
					move.right=n1;
					System.out.println("Node  is added at right of  "+move.data);
					break;
				}
				else
				{
					move=move.right;
				}
			}
			else
			{
				System.out.println("Invalid choice !!! ");	
				break;
			}
		}

	} 
	public void inOrder(Node move)
	{
		if(move!=null)
		{
			inOrder(move.left);
			System.out.print(move.data+"\t");
			inOrder(move.right);
		}
	}
	
	public void preOrder(Node move)
	{
		if(move!=null)
		{
			System.out.print(move.data+"\t");
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
			System.out.print(move.data+"\t");
		}
	}
	public void display()
	{
		System.out.println();
		System.out.println("*******************Inorder***********************");
		inOrder(root);
		System.out.println();
		System.out.println("*******************PreOrder**********************");
		preOrder(root);
		System.out.println();
		System.out.println("*******************PostOrder**********************");
		postOrder(root);
	}
}
