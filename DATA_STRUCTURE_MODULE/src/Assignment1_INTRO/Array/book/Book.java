package Assignment1_INTRO.Array.book;
import java.util.Scanner;
public class Book {
	int bno;
	String name;
	public Book()
	{

	}
	public Book(int bno,String nm)
	{
		this.bno=bno;
		this.name=nm;
	}
	public String toString()
	{
		return bno+"\t"+name;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Book books[];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size for Book Array ");
		int no=sc.nextInt();
		books=new Book[no];

		int bno,cnt=0;
		String name;
		int ch;
		do
		{
			System.out.println(" 1. Add Recod");
			System.out.println(" 2. Display All Records ");
			System.out.println(" 3. Modify");
			System.out.println(" 4. Delete Record");
			System.out.println(" 5. Search");
			System.out.println(" 6. Count");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Book No ");
				bno=sc.nextInt();
				System.out.println(" Enter Name ");
				name=sc.next();
				books[cnt++]=new Book(bno,name);
				break;
			case 2:
				for(int i=0;i<cnt;i++)
					System.out.println(books[i]);
				break;

			case 3:
				System.out.println("Enter  no of record to modify : ");
				int modify=sc.nextInt();
				for(int i=0;i<no;i++)
				{
					if(i==modify)
					{
						System.out.println("Enter new book number :");
						int bnum=sc.nextInt();
						books[i].setBno(bnum);
						System.out.println("Enter new Book name :");
						String newname=sc.next();
						books[i].setName(newname);

					}
				}
				break;

			case 4:
				System.out.println("Enter record to delete");
				int choice=sc.nextInt();

				for(int i=0;i<no;i++)
				{  
					if(choice==i)
					{
						cnt--;
						books[i]=books[i+1];
					}

				} break;
			case 5:

				System.out.println("Enter book name to be search ");
				String book=sc.next();
				for(int i=0;i<no;i++)
				{
					if(book.equals(books[i].getName()))
					{
						System.out.println("Book is found !!!");
					}
					else 
					{
						System.out.println("Book is not found !!!");
					}
				}
			}
			break;


		}while(ch!=0);




	}



}






