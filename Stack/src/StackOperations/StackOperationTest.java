package StackOperations;

import java.util.Scanner;

public class StackOperationTest { 
	public static int evaluteExp(String str)
	   { 
		cStack s1=new cStack();
		   int no1 = 0,no2 = 0,res = 0;
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 if(ch>='0' && ch<='9')
			 {
				 s1.push((int)(ch-'0'));
			 }
			 else if(isOperator(ch))
			 {  
				 s1.display();
				 no2=s1.pop();
				 no1=s1.pop();
				 s1.display();
			 
			 switch(ch)
			 {
			 case '+':
				 res=no2+no1;
				 break;
			 case '-':
				 res=no2-no1;
				 break;
			 case '*':
				 res=no2*no1;
				 break;
			 case '/':
				 res=no2/no1;
				 break;
			 }
			 s1.push(res);
			 }
		 else
		 {
			 System.out.println("Not Valid !!!");
			 break;
		 }
		 }
		return res=s1.pop();
	   } 
	
//	static int precedence(char c)
//	{
//	         switch (c)
//	         {
//	             case '+':
//	             case '-':
//	                 return 1;
//	             case '*':
//	             case '/':
//	                 return 2;
//	             case '^':
//	                 return 3;
//	         }
//	         return -1;
//	}
		public static boolean isOperator(char ch) 
		{
		if( (ch=='+' || ch=='-'|| ch=='*'||ch=='/'))
		{
			return true;
		} 
		else if(ch>='0' && ch<='9')
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
		
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Expression");
	
//	String str=sc.next();
	String str="945*+";
	
	int res=evaluteExp( str); 
	System.out.println("Result of Evalution  :"+res);
   
	
		
		

	}

}
