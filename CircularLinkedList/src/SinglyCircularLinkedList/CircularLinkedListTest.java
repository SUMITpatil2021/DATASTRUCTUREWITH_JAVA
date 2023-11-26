package SinglyCircularLinkedList;

import java.util.Scanner;



public class CircularLinkedListTest {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms for Linked List ");
		int term=sc.nextInt();
		l1.createLinkedList(term);
		l1.display();
		int ch;
		do
		{
			
			System.out.println("\n1. Add at Beg");
			System.out.println("2. Add at End");
			System.out.println("3. Add at mid according to position ");
			System.out.println("4. Display");
			System.out.println("5.size of linkedlist");
			System.out.println("0. Exit");
			System.out.println("Enter Your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data");
				int data=sc.nextInt();
				
				l1.addFirst(data);
				break;
			case 2: 
				System.out.println("Enter data ");
				data=sc.nextInt();
				l1.addEnd(data);
				break;
			case 3:
				System.out.println("Enter position ");
				int pos=sc.nextInt();
				System.out.println("Enter Data");
				data=sc.nextShort();
				l1.addMid(pos, data);
				break;
			case 4:
				l1.display();
				break;
			case 5:
				System.out.println(l1.size());
				break;
			}
		}while(ch!=0);
	}

}
