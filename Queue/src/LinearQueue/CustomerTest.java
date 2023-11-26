package LinearQueue;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Customer custmoers[];
		System.out.println("Enter size of customer queue");
		int size=sc.nextInt();
		CustomerQueue c1=new CustomerQueue(size);
		
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
					  System.out.println("Enter Customer ID ");
					  int id =sc.nextInt();
					  System.out.println("Enter Customer Name:");
					  String name=sc.next();
					  Customer data=new Customer(id,name);
					 c1.enQueue(data);
				break; 
				 case 2:
					data= c1.deQueue();
					 if(data==null)
					 {
						System.out.println("Queue is Empty"); 
						 
					 }
					 else
					 {
						 System.out.println("Deleted Element is :"+data);
					 }
					 break;
				 case 3:
					 
					 c1.display();
			 }
			 
		 }while(ch!=0);

		
	}

}
