package stack;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for stack ");
		int size=sc.nextInt();
		cStack c1=new cStack(size);
		int ch;
		
		do
		{
			System.out.println();
			System.out.println(" 1. push ");
			System.out.println(" 2. Pop ");
//			System.out.println(" 3. Peek ");
			System.out.println(" 3. display ");
			System.out.println(" 4. Reverse Stack ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					int data;
					try {
					System.out.println("Enter data :");
					data=sc.nextInt();
					c1.push(data);
					}
					catch(StackIsFullException e)
					{
						System.out.println(e.getMessage());
					}
				break;
				case 2:
					 try
					 {
					data=c1.pop();
						System.out.println("Deleted element is:"+data);
					 }
					 catch(StackIsEmptyException e)
					 {
						 System.out.println(e.getMessage());
					 }
					break;
				case 3:
						c1.display();
						break;
				case 4: 
					c1.reverseStack();
					break;
			}
			

		} 
		while(ch!=0);
		
	}

	}


