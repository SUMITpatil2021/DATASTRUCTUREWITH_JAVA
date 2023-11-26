package Sort;

import java.util.Scanner;

public class selectionSort {
	public static void selSort(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			int small=arr[i];
			int index=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<small)
				{
					small=arr[j];
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=small;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		BasicArray.accept(arr, size);
		System.out.println("\n  array");
		BasicArray.display(arr);
		selSort(arr);
		System.out.println("\n Sorted array");
		BasicArray.display(arr);
	}

}
