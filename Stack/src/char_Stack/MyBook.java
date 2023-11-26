package char_Stack;

import java.util.Scanner;


public class MyBook {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Book books[];
		System.out.print("Enter  Book Stack size:");
		int size=sc.nextInt();
		BookStack b1=new BookStack(size);
		
		

		int bno,cnt=0;
		String name;
		int ch;
		do 
		{	
			System.out.println();
			System.out.println("1. Push Book Data ");
			System.out.println("2. Display Book data");
			System.out.println("3. Pop Book Data ");
			System.out.print(" Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter book number ");
				bno=sc.nextInt();
				System.out.println("Enter Book Name ");
				name=sc.next();
				Book b=new Book(bno,name);
				b1.push(b);
				break;
			case 2:
				b1.display();
				break;
			case 3:
				 Book data=b1.pop();
					if(data==null)
					{
						System.out.println("**************");
						System.out.println("Stack is empty");
					}
					else
					{
						System.out.println("Deleted element is:"+data);
					}
					
					
					break;
					
					
					
			}
		} while(ch!=0);
	}

}
