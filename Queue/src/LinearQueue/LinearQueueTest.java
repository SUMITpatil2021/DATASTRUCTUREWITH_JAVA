package LinearQueue;

import java.util.Scanner;

public class LinearQueueTest {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size for array");
		 int size=sc.nextInt();
		 linearQueue l1=new linearQueue(size);
		 int ch;
		 
		 do 
		 {
			 System.out.println();
			 System.out.println("1. Insert  ");
			 System.out.println("2. Delete ");
			 System.out.println("3. Display ");
			 System.out.print("Enter your choice:");
			 ch=sc.nextInt();
			 switch(ch)
			 {
				 case 1:
					 System.out.println("Enter data");
					 int data=sc.nextInt();
					 l1.enQueue(data);
				break; 
				 case 2:
					data= l1.deQueue();
					 if(data==-9999)
					 {
						System.out.println("Queue is Empty"); 
						 
					 }
					 else
					 {
						 System.out.println("Deleted Element is :"+data);
					 }
					 break;
				 case 3:
					 
					 l1.display();
			 }
			 
		 }while(ch!=0);

	}

}
