package DoublyLiinkedList;
import java.util.Scanner;
public class LinkedListTest {

		public static void main(String[] args) {
			Scanner sc=new  Scanner (System.in);
			LinkedList l1=new LinkedList();
			
			int ch;
		 
		   do
		   {
			   System.out.println("\n 1. Add at beginning  ");
			   System.out.println("2. Add at Last ");
			   System.out.println("3. Add according to position ");
			   System.out.println("4. Delete data");
			   System.out.println("5. To print reverse LinkedList ");
			   System.out.println("6. display");
			   System.out.println("0. Exit");
			   System.out.print("Enter your choice ");
			   ch=sc.nextInt();
			   switch(ch)
			   {
			   case 1:
				   System.out.println("Enter data");
				   int data=sc.nextInt();
				   l1.addFirst(data);
				   break;
				   
			   case 2:
				   System.out.println("Enter data");
				   data=sc.nextInt();
				   l1.addLast(data);
				   break;
				   
				   case 3:
				  System.out.println("Enter Position where new data to be added ");
				  int pos=sc.nextInt();
				  System.out.println("Enter Data ");
				  data=sc.nextInt();
				  l1.addPos(pos, data);
				  break;
				   case 4:
					   System.out.println("Enter data");
					   data=sc.nextInt();
					   l1.delete(data);
					   System.out.println("************************After Deleting Linked List ****************************");
					   l1.display();
					   break;
					   
				   case 6:
					   l1.display();
					   break;
			
			   }
		   }while(ch!=0);
			
		}
}

	

	
	
