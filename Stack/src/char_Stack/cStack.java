package char_Stack;



public class cStack {
	private  int size;
	private int top;
	private char arr[];

	public cStack()
	{
		this.size=3;
		arr=new char[size]; 
		this.top=-1;

	}
	public cStack(int size)
	{
		this.size=size;
		arr=new char[size];
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
	public void push(char data)
	{
		if(!isFull())
		{
			top++;
			arr[top]=data;
		}
		else
		{
			System.out.println("Stack is overflow !!!");
		}
	}
	public char pop()
	{
		char  data='\0';
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public int peek()
	{
		int data=0;
		if(!isEmpty())
		{
			data=arr[top];
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
	
