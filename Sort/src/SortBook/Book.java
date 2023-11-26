package SortBook;

public class Book {

	private int bookno;
	private String bname;
	private double price;
	public Book()
	{
		this.bookno=0;
		this.bname="NA";
		this.price=0;
			
	}
	public Book(int bookno,String bname,double price)
	{
		this.bookno=bookno;
		this.bname=bname;
		this.price=price;
	}
	
	public int getBookno()
	{
		return bookno;
	}
	public String getBookname()
	{
		return bname;
	}
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "\n\t [ Book No. : "+bookno+"Book Name:"+bname+"Price :"+price+"]";
	}
	
	
}
