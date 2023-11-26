// Program for finding first 10 prime numbers 

package Assignment1_INTRO.Prime;

public class First10Prime {
 
	public static void main(String[] args) {
		int cnt=1,no=1,count=0;
		while(cnt<=10)
		{
		 boolean flag=true;
		 for(int i=2; i<=no/2;i++)
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
			 count++;
		 }
		 no++;
		 
		}
		System.out.println("\n Count:"+count);

}
}
