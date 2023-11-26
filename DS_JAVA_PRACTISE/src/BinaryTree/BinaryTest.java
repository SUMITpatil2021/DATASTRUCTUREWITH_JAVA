package BinaryTree;

import java.util.Scanner;

public class BinaryTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTree b1=new BinaryTree();
		
		int ch;
		do 
		{
			
			System.out.println();
			System.out.println("1.Add nodes in Binaray tree");
			System.out.println("2. Display ");
			System.out.println("3.Find maximum Node ");
			System.out.println("4.Find minimum Node ");
			System.out.println("5.Delete ");
			System.out.println("0.Exit");
			System.out.println("Enter choice");
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
		case 3:
			System.out.println("Highest Node in Tree is :"+b1.higherNode());  
			break;
		case 4:
			System.out.println("Smaller Node in Tree is :"+b1.smallerNode());   
			break;
		case 5:
			System.out.println("Enter data to delete");
			data=sc.nextInt();
			b1.deleteNode(data);
			break;
		}
		}while(ch!=0);

	}

}
