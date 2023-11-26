// check weather the number is prime or not using method 

package Assignment1_INTRO.Prime;

import java.util.Scanner;

public class CheckPrime {
     
	 
	public static boolean checkPrime(int num)
	{
		boolean flag=true; 
		
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return  flag;
	}
	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);
		 System.out.print("Enter a number :");
		 int num=sc.nextInt();
		 
		 boolean res=checkPrime(num);
		 if(res==true && num>=1)
		 {
			 System.out.println("Number is Prime number ");
		 }
		 else
		 {
			 System.out.println("Number is not Prime ");
		 }

	} 
	
	

}
