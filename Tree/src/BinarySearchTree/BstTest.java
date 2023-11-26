package BinarySearchTree;

import java.util.Scanner;



public class BstTest {


	public static void main(String[] args) {
		BSTree b1=new BSTree();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println();
			System.out.println("1. Add Node ");
			System.out.println("2. Display");
			System.out.println("3. Delete Node");
			System.out.println("4. Search Node in Tree");
			System.out.println("5. Higher node");
			System.out.println("6. Smaller Node ");
			System.out.println("7. Height of tree");
			System.out.println("8. To Print Level Wise nodes");
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
			case 3:
				System.out.println("Enter data to be deleted");
				data=sc.nextInt();
				b1.deleteNode(data);
				break;
			case 4:
				System.out.println("Enter data to search ");
				data=sc.nextInt();
				boolean res=b1.searchNode(data);
				if(res)
				{
					System.out.println("Data is Found !!!");
				}
				else
				{
					System.out.println("Data is not found !!!");
				}
				break;
			case 5:
				System.out.println("Higher Node is : "+b1.highestNode());	
				break;
			case 6:
				System.out.println("Smaller Node is : "+b1.smallestNode());
				break;

			case 7:
				System.out.println("Height of Tree is :"+b1.heightofTree(b1.root));
				break;
			case 8:
				b1.levelWisePrint();
				break;

			}

		} while(ch!=0);

	}

}
