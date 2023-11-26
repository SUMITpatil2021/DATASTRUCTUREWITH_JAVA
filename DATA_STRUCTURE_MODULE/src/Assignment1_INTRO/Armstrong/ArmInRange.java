
//  find the Armstrong numbers between 1 to 10000
package Assignment1_INTRO.Armstrong;

public class ArmInRange {

	public static void main(String[] args) {
		  int count=0;
		for(int i=1;i<=10000;i++)
		 {  
			int index=countDigit(i);
			int mod=0,sum=0;
			int num=i;
			int no=i;
			while(no!=0)
			{
				mod=no%10;
				no=no/10;
				sum=sum+power(mod,index);
			} 
			if(sum==num)
			{
				System.out.println(num);
				count++;
			}
			 
		 }
		System.out.println("Armstrong Numbers between 1 to 10000 are :"+count);

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
