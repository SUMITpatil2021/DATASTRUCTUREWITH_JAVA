package char_Stack;

import java.util.Scanner;

public class ParenthesisBalance {
	public static boolean isBalance(String str)
	{	 
		boolean flag=true;
		cStack c1=new cStack(str.length());
		char ch1,ch2;
		for(int i=0;i<str.length();i++)
		{
			ch1=str.charAt(i);
			if(ch1=='(' || ch1 =='{' || ch1== '[' ||ch1 =='<')
			{
				c1.push(ch1);
				
			}
			else if(ch1==')'||ch1=='}'||ch1==']'||ch1=='>')
			{
				ch2=c1.pop();
				if((ch1==']'&& ch2!='[') ||(ch1==')'&& ch2!='(')||(ch1=='}'&& ch2!='{')||(ch1=='>'&& ch2!='<') )
				{
					flag=false;
					break;
				}
			}
			else if (!c1.isEmpty())
					return false;

				else
				{
					return false;
				}
				
			}
		return flag;
			
		}

	
	public static void main(String [] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		if(isBalance(str))
		{
			System.out.println("String is Balanced ");
		}
		else
		{
			System.out.println("String is not balanced");
		}
			
}
}