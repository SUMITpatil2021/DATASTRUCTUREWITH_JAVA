package stack;

public class cStack {
int top;
int size;
int arr[];
public cStack()
{
	top=-1;
	size=3;
	arr=new int[size];
}

public cStack(int size)
{
	this.size=size;
	top=-1;
	arr=new int [size];
}
public boolean isEmpty()
{
	return top==-1?true:false;
}

public boolean isFull()
{
	return top==size-1?true:false;
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
		throw new StackIsFullException();
	}
}
public int pop()
{
 int data=0;
 if(!isEmpty())
 {
	 data=arr[top];
	 top--;
	 return data;
 }
 else
 {
	 throw new StackIsEmptyException();
 }
} 


public void reverseStack()
{
	System.out.println(" **** Reverse Stack *******");
	for(int i=0;i<=size-1;i++)
	{
		System.out.print("\t"+arr[i]);
	}
}
public void display()
{
	if(!isEmpty())
	{System.out.println("****  Stack ****");
		for(int i=top;i>-1;i--)
		{
			System.out.print("\t"+arr[i]);
		}
		
	}

}
}
