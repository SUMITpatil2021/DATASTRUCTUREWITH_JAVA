package char_Stack;

public class BookStack {


	private  int size;
	private int top;
	private Book arr[];

	public BookStack()
	{
		this.size=3;
		arr=new Book[size]; 
		this.top=-1;

	}
	public BookStack(int size)
	{
		this.size=size;
		arr=new Book[size];
		top=-1;
	}

	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(Book data)
	{
		if(!isFull())
		{
			top++;
			arr[top]=data;
		}
		else
		{ 
			System.out.println("************************************");
			System.out.println("Stack is overflow !!!");
		}
	}
	public Book pop()
	{
		Book  data=null;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	public void display()
	{
		System.out.println("********************** Stack is *******************");
		for(int i=top;i>=0;i--)
		{
			System.out.print("\t"+arr[i]);
		}
	}
	
	
	
}
	
