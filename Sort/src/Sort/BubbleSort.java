package Sort;

import java.util.Scanner;



public class BubbleSort {
	public static void bubbleSort(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		BasicArray.accept(arr, size);
		BasicArray.display(arr);
		bubbleSort(arr);
		System.out.println("\n Sorted array");
		BasicArray.display(arr);
	}

}
