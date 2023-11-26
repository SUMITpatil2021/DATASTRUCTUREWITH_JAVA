package Assignment1_INTRO.Number;

import java.util.Scanner;

public class CountDigit {
    public static int countDigits(int num)
    {  int cnt=0;
      while(num!=0)
      {
    	num=num/10;
    	cnt++;
      }
      return cnt;
      
    } 
    public static int revereseOrder(int num)
    {
    	int sum=0,mod=0;
    	while(num!=0)
    	{
    		mod=num%10;
    		sum=(sum*10)+mod;
    		num=num/10;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		System.out.println("digits in "+num+" are : "+countDigits(num)); 
		System.out.println("Reverse order of "+num+" is :"+revereseOrder(num));
	}

}
