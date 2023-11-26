/******* Program for finding prime numbers between 1 to 100 also prints the count of prime numbers */

package Assignment1_INTRO.Prime;

public class Prime {

	public static void main(String[] args) {
		boolean flag;
		int cnt=0;
		for(int no=1;no<=100;no++)
		{    
//			flag=true;
//			if(no<=1)
//			{
//				flag=false;
//				break;
//			}
			flag=true;
			
			for(int i=2;i<=no/2;i++)
			{
			if(no%i==0) 
			{
				flag=false;
				
				break;
			}
			}
			if(flag==true && no!=1)
			{
				System.out.print(no+" ");
				cnt++;
			}
		}
		System.out.println("\nPrime Numbers between 1 to 100 are :"+cnt);


	}

}
