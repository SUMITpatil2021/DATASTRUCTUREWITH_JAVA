package cStack;

import java.util.Scanner;

public class iStackTest {

	public static void main(String[] args) {
		iStack c1=new iStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		
		int ch;
		
		do
		{
			System.out.println(" 1. push ");
			System.out.println(" 2. Pop ");
			System.out.println(" 3. display ");
//			System.out.println(" 4. display ");
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
					System.out.println("******STACK *********");
					c1.display();
					break;
					
			}
			

		} 
		while(ch!=0);

	}

}
