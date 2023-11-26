package cStack;

public class cStackPrime {
	public static boolean isPrime(int no)
	{
		boolean flag=true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag == true && no!=1)  
		{w
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		cStack c1=new cStack(10);
		int cnt=0,no=2; 
		
		while(cnt<10)
		{
			if(isPrime(no))
			{
				c1.push(no);
				cnt++;
			}
			no++;
		}
		c1.display();
		
	}

}
