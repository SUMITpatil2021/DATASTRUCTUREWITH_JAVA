package Assignment1_INTRO.Fibo;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter terms for fibo series:");
		int terms=sc.nextInt();
		
	   PrintFibo(terms);

	}
	
	public static void PrintFibo(int terms)
	{  int a=0,b=1;
		for(int i=0;i<terms;i++)
		{
			System.out.print(a+" ");
			 int c=a+b;
			a=b;
			b=c;
		}
	}

}
