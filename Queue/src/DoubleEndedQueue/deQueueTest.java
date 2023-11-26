package DoubleEndedQueue;

import java.util.Scanner;

public class deQueueTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		cQueue q1=new cQueue();
		int ch;
		do
		{ 
			System.out.println();
			System.out.println("1. enQueueFront");
			System.out.println("2. enQueueRear");
			System.out.println("3. deQueueFront");
			System.out.println("4. deQueueRear");
			System.out.println("5. Display");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter data");
				int data=sc.nextInt();
				q1.enQueueFront(data);
				break;
			case 2:
				System.out.println("Enter data");
				data=sc.nextInt();
				q1.enQueueRear(data);
				break;
			case 3:
				data=q1.deQueueFront();
				System.out.print("Deleted Element is:"+data);
				break;
			case 4: 
				data=q1.deQueueRear();
				System.out.print("deleted element is :"+data);
				break;
			case 5:
				q1.display();
				break;
			}
		}while(ch!=0);
		

	}

}
