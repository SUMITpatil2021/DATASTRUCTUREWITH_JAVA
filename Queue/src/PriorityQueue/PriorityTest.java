package PriorityQueue;

import java.util.Scanner;

public class PriorityTest {
 public static void main(String[] args) {
	

	Element data;
	int ch;
	cQueue q1=new cQueue();
	int no,pri;
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println(" 1. Enqueue");
		System.out.println(" 2. deleter");
		System.out.println(" 3. Display");
		System.out.println(" 0. Exit");
		System.out.println(" Enter Your choice ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println(" Enter Data  to insert ");
			no=sc.nextInt();
			System.out.println(" Pri to insert ");
			pri=sc.nextInt();
			data=new Element(no, pri);
			//q1.enQueue(new Element(no, pri));
			q1.enQueue(data);
			break;
		case 2:
			data=q1.deQueue();
			if(data!=null)
				System.out.println(data);
			break;
			
		case 3:
			q1.display();
			
		}
	}while(ch!=0);
}
}
