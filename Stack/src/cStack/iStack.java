package cStack;

public class iStack {
public int top;
public int size;
public int arr[];

public iStack()
{
	top=-1;
	size=3;
	arr=new int[size];
}

public iStack(int size)
{
	this.size=size;
	arr=new int[this.size];
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
	
/*--------------using ternory operator  ------------*/ 
	
	//return top==-1?true:false;
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
	   System.out.println("Stack is Full !!!!");
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
 
   else
   {
	   System.out.println("Stack is Empty!!!!");
   } 
   return data;
}

//public void reverse()
//{
//   
//}

public void display()
{
	for(int i=top;i>=0;i--)
	{
//		System.out.println("Stack is ");
		System.out.print("\t"+arr[i]);
	} 
	System.out.println();
}


}
