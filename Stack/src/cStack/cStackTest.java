package cStack;

import java.util.Scanner;

public class cStackTest {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of for stack");
		int size=sc.nextInt();
		cStack c1=new cStack(size);
		int ch;
		
		do
		{
			System.out.println();
			System.out.println(" 1. push ");
			System.out.println(" 2. Pop ");
			System.out.println(" 3. Peek ");
			System.out.println(" 4. display ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					int data;
					System.out.println("Enter data :");
					data=sc.nextInt();
					c1.push(data);
				break;
				case 2:
					 data=c1.pop();
					if(data==-9999)
					{
						System.out.println("Stack is empty");
					}
					else
					{
						System.out.println("Deleted element is:"+data);
					}
					break;
				case 3:
					System.out.println("Top most element of stack is :"+c1.peek());
					break;
				case 4:
					c1.display();
					break;
					
			}
			

		} 
		while(ch!=0);
		
	}

}
