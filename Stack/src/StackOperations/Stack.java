package StackOperations;

public class Stack {

	int top;
	int arr[];
	int size;
	public Stack()
	{
		this.top=-1;
		this.size=3;
		arr=new int[size];
	}
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		this.top=-1;
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
			System.out.println("Stack is OverFlow !!!");
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
	
	public boolean isEmpty()
	{
		if (top==-1)
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
	
	public void display()
	{   
		System.out.println("******  STACK ********");
		for(int i=top;i>-1;i--)
		{
		System.out.println("\t"+arr[i]);	
		}
		} 
	
	
	
	}

