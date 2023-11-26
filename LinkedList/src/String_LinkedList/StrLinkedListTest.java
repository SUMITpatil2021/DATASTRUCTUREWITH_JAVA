package String_LinkedList;

import java.util.Scanner;

public class StrLinkedListTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter size for Creating LinkedList ");
		int size=sc.nextInt();
		LinkedList l1=new LinkedList();
		int ch;
		do
		{
			System.out.println("\n1. Create Linked List ");
			System.out.println("2. Add String At begenning ");
			System.out.println("3. Add String at end ");
			System.out.println("4. Display ");
			System.out.println("5. Display size of LinkedList");
			System.out.println("6. Search String in LinkedList");
			System.out.println("7. Modify String  accordig to string ");
			System.out.println("8. Modify String according to position ");
			
			 ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					l1.createLinkedList(size);
					break;
				case 2:
					System.out.println("Enter String to add : ");
					String string=sc.next();
					l1.addBeg(string);
					break;
				case 3:
					System.out.println("Enter String to add : ");
					 string=sc.next();
					 l1.addEnd(string);
					break;
				case 4:
					l1.display();
					break;
				case 5:
					int length=l1.size();
					System.out.println("Size of linkedList is :"+length);
					break;
				case 6: 
					
					break;
				case 7:
					
					break;
				case 8:
					System.out.println("Enter Position to modify String");
					int pos=sc.nextInt();
					System.out.println("Enter  new String :");
					String newstring=sc.next();
					l1.modifyDirect(pos, newstring);
					break;
			}
		} while(ch!=0);
			

	}

}
