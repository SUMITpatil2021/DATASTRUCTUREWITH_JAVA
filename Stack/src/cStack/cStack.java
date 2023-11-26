package cStack;

public class cStack {
	private  int size;
	private int top;
	private int arr[];

	public cStack()
	{
		this.size=3;
		arr=new int[size]; 
		this.top=-1;

	}
	public cStack(int size)
	{
		this.size=size;
		arr=new int[size];
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
	public void push(int data)
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
	public int pop()
	{
		int data=-9999;
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
		for(int i=top;i<0;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
	
}
	
