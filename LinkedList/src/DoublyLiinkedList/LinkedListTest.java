package DoublyLiinkedList;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		Scanner sc=new  Scanner (System.in);
		LinkedList l1=new LinkedList();
		System.out.println("Enter terms for Linked List ");
		int term=sc.nextInt();
		l1=new LinkedList(term);
		int ch;
	 
	   do
	   {
		   System.out.println("\n 1. Insert data according to position ");
		   System.out.println("2. add at beginning ");
		   System.out.println("3. delete data accoridng to data");
		   System.out.println("4. Modify data");
		   System.out.println("5. To print reverse LinkedList ");
		   System.out.println("6. display");
		   System.out.println("0. Exit");
		   System.out.print("Enter your choice ");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1:
			  System.out.println("Enter Position where new data to be added ");
			  int pos=sc.nextInt();
			  System.out.println("Enter Data ");
			  int data=sc.nextInt();
			  l1.insert(pos, data); 
			  System.out.println("****LinkedList after inserting new data****");
			  l1.display();
			  break;
		   case 2:
			   System.out.println("Enter data");
			   data=sc.nextInt();
			   l1.addFirst(data);
			   break;
		   case 6:
			   l1.display();
			   break;
			   
		   case 3:
			   System.out.println("Enter data to delete ");
			    data=sc.nextInt();
			   l1.deleteData(data);
			   System.out.println("***LinkedList After  deleting data***");
			   l1.display();
			   break;
			   
		   case 5:
			   l1.reverese();
			   break;
		   }
	   }while(ch!=0);
		
	}

}
