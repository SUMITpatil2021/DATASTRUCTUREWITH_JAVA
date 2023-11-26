package Binary;

import java.util.Scanner;

public class BinarySearch {
	public static int search(int arr[],int key)
	{
		int size=arr.length;
		int start,end,mid;
		start=0;
		end=size-1;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(arr[mid]==key)
			{
				return mid;	
			}
			else if(arr[mid]<key)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		BasicArray.accept(arr, size);
		BasicArray.display(arr);
		System.out.println("\n Enter the search key ");
		int key =sc.nextInt();
		int res=search(arr,key);
		if(res!=-1)
		{
			System.out.println("Element found at index "+res);

		}
		else
		{
			System.out.println("Element  not found !!!");
		}
	}

}
