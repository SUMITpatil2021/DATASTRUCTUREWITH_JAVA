package Int_LinkedList;

import java.util.Scanner;

public class IntLinkedListTest {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter element no. in linkedlist");
		int size=sc.nextInt();
		int ch;
		do
		{
			System.out.println("\n1.  Create Linked List ");
			System.out.println("2. Add data at end");
			System.out.println("3. Display LinkedList");
			System.out.println("4. Delete according to position ");
			System.out.println("5. Delete according to data");
			System.out.println("6. To Print LinkedList in reverse order");
			System.out.println("7. To insert node at Spicific position ");
			System.out.println("8. To find mid of LinkedList");
			System.out.println("9. To Sort LinkedList");
			System.out.println("10. To reverese LinkedList");
			System.out.println("0. Exit");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				l1.createLinkedList(size);
				break;
			case 2:
				System.out.println("Enter data in linkedList");
				int data=sc.nextInt();
				l1.addNode(data);
				break;
			case 3:
				l1.display();
				break;
			case 4:
				System.out.println("Enter Position to delete Node");
				int pos=sc.nextInt();
				l1.delete(pos);
				System.out.println("LinedList After Delete ");
				l1.display();
				break;
			case 5:
				System.out.println("Enter data to delete");
				data=sc.nextInt();
				l1.delete(data);
				System.out.println("LinedList After Delete ");
				l1.display();
				break;
			case 6:
				l1.reverse(l1.head);
//				l1.display();
				break;
				
			case 7:
				System.out.println("Enter position");
				 pos=sc.nextInt();
				 System.out.println("Enter data");
				 data=sc.nextInt();
				 l1.insert(pos, data);
				
				 l1.display();
				 break;
			case 9:
				l1.sortLinkedList();
				l1.display();
				break;
				
			case 10:
				l1.revereseLinkedList();
				System.out.println("Reverse LinkedList ");
				l1.display();
				break;
				
				
			}
		} while(ch!=0);

	}

}
