package EvenOddPrint;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LinkedList l1=new LinkedList();
		int ch;
		do 
		{
			System.out.println();
			System.out.println("1.Add Node ");
			System.out.println("2. Display ");
			System.out.println("3. Display Even-Odd wise ");
			System.out.println("0. exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			 System.out.println("Enter data");
			 int data=sc.nextInt();
			 l1.addNode(data);
			 break;
			case 2:
				l1.display();
				break;
			case 3:
				l1.eveOdddisplay();
				break;
			}
		}while(ch!=0);

	}

}
