package Assignment1_INTRO.Armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.print("Enter Number :");
		int num=sc.nextInt();
		int temp=num;
		int index=countDigit(num); 
		
		while(num!=0)
		{
			 int mod=num%10;
			 num=num/10;
			  sum=sum+power(mod,index);
		} 
		if(sum == temp)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is not armstrong ");
		}
		
		
	}
	
	public static int countDigit(int num)
	{
		
		int cnt=0;
		while(num!=0)
		{
			num=num/10;
			cnt++;
			
		}
		
		return cnt;
	}
	
	public static int power(int mod,int index)
	{
		int res=1;
		for(int i=1;i<=index;i++)
		{
			res=res*mod;
		}
	return res;	
	}

}
