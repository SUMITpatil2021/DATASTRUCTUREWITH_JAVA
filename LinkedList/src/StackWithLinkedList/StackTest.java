package StackWithLinkedList;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
	Stack s1=new Stack();
	Scanner sc=new Scanner(System.in);
	int ch;
	do 
	{
		System.out.println("\n1. push");
		System.out.println("2. Pop");
		System.out.println("3. Display");
		System.out.println("Enter your choice ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter data");
			int data=sc.nextInt();
			s1.push(data);
			break;
		case 2: 
			try 
			{
			data=s1.pop();
			System.out.print("Deleted Element is :"+data);
			}
			catch(StackisEmptyException s)
			{
				System.out.println(s.getMessage());  
			}
//			if(data!=-9999)
//			{
//				System.out.print("Deleted Element is :"+data);
//			}
//			else
//			{
//				System.out.println("Stack is empty!!!");
//			}
			break;
		case 3:
			s1.display();
			break;
		}
	}while(ch!=0);
	

	}

}
