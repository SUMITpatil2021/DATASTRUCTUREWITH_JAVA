package DyanamicQueue;

import java.util.Scanner;

public class DyanamicQueueTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	cQueue q1=new cQueue();
	int ch;
	do
	{
		System.out.println();
		System.out.println("1.Enqueue");
		System.out.println("2.deQueue");
		System.out.println("3.display");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter data");
			int data=sc.nextInt();
			q1.enQueue(data);
			break;
			
		case 2:
			data=q1.deQueue();
			System.out.println("Deleted Element is :"+data);
			 break;
			 
		case 3: 
			System.out.println(q1);
			break;
		}
		
	}while(ch!=0);

	
	}

}
