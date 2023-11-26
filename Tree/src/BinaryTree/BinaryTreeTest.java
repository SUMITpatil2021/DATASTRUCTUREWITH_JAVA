package BinaryTree;

import java.util.Scanner;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree b1=new BinaryTree();
	Scanner sc=new Scanner(System.in);
	int ch;
	do
	{
		System.out.println();
		System.out.println("1. Add Node ");
		System.out.println("2. Display");
		System.out.println("0. Exit");
		System.out.print("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter data");
			int data=sc.nextInt();
			b1.addNode(data);
			break;
		case 2:
			b1.display();
			break;
		}
		
	} while(ch!=0);

	}

}
