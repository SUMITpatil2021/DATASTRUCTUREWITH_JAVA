package Array.basicOperations;

import java.util.Scanner;

public class ArrayOperation {
	
///*******method for sum finding sum of array elements ***/////////
	public  static int sumArray(int arr[])
	{   int sum=0;
	for(int i=0;i<arr.length;i++)
	{   
		sum+=arr[i];
	}

		return  sum;
	}
	
///*******Sum of Even Numbers*******//////	
	public static int  sumEven(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
           if(arr[i]%2==0)
           {
        	   sum +=arr[i];
           }
           
		}
		return sum;
	}
///*******Sum of Odd  Numbers *****///
	public static int sumOdd(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum +=arr[i];
			}		
		}
		return sum;
	}
	
///*******Sum of  Numbers at even position ***////
	public static int  sumEvenPos(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				sum+=arr[i];
			}	
		}
		return sum;
	}
	
///****Sum of  Numbers at odd position ***////
	public static int sumOddPos(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				sum+=arr[i];
			}
		}
		return sum;
		}
///*******  Search elemen ******/////
	public static void searchElement(int arr[],int key)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag=true;
				break;
			}
				
		}
		if(flag==true)
		{
			System.out.println("Number is found!!!");
		}
		else
		{
			System.out.println("Number is not found !!!");
		}
		
	} 
	
///******* Average of all elements ****////
	public static float  averageArray(int arr[])
	{
		 float avg=0,sum=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 sum+=arr[i];
			 
		 }
		 return  avg=sum/arr.length; 
	} 
	
///***** Find smallest number*******//////
	
	public static int smallestNum(int arr[])
	{
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		return small;
	}
	
///***** Find Greatest  number
	public static int greatestNum(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],no;
		System.out.println("Enter the size for array");
		no=sc.nextInt();
		arr=new int[no]; 
		int ch;

		do 
		{

			System.out.println(" 1. Add elements into array");
			System.out.println(" 2. Display array elements ");
			System.out.println(" 3. Sum of all elements ");
			System.out.println(" 4. Sum of Even Numbers ");
			System.out.println(" 5. Sum of odd numbers ");
			System.out.println(" 6. Sum of numbers at even position ");
			System.out.println(" 7. Sum of numbers at odd position ");
			System.out.println(" 8. Search element");
			System.out.println(" 9. Average of all elements");
			System.out.println(" 10. Find smallest number  ");
			System.out.println(" 11.Find Gretest Number ");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{ 
			case 1:
				System.out.println("Enter the "+no+" elements in array");

				for(int i=0;i<no;i++)
				{
					arr[i]=sc.nextInt();
				}
				break;
			case 2:
				for(int i=0;i<arr.length;i++)
				{
//					System.out.println();
					System.out.print("\t"+arr[i]);
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Sum of all elements in array :"+sumArray(arr));
				break;
			case 4:
				System.out.println("Sum of even numbers : "+sumEven(arr));
				break;
			case 5:
				System.out.println("Sum of odd numbers : "+sumOdd(arr));
				break;
			case 6:
				System.out.println("Sum of number at even positions : "+sumEvenPos(arr));
				break;
			case 7:
				System.out.println(" Sum of numbers at odd positions : "+sumOddPos(arr));
				break;
			case 8:
				System.out.println("Enter number to be search :");
				int key=sc.nextInt();
				searchElement(arr,key);
				break;
			case 9:
				System.out.println("Average of array elements : "+averageArray(arr));
				break;
			case 10:
				System.out.println(" Smallest number from an array is :"+smallestNum(arr));
				break;
			case 11:
				System.out.println("Greatest number from an array is :"+greatestNum(arr));
				break;
			}

		}
			while(ch!=0);


	}

	}
