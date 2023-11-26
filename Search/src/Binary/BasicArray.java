package Binary;

import java.util.Scanner;

public class BasicArray { 
	public static void accept(int arr[],int size)
	{   	

	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+ size +" elements in array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
	}
	public static void display(int arr[])
	{
		System.out.println("**********************Array is **************************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t "+arr[i]);
		}
	}
}
