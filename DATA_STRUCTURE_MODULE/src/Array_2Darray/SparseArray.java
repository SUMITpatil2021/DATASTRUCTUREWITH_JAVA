package Array_2Darray;

import java.util.Scanner;

public class SparseArray {
   public static int countNonZero(int arr[][],int row,int col)
   { 
	   int count=0;
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		if(arr[i][j]!=0)
	    		{
	    			count++;
	    		}
	    	}
	    }
	   
	return count;
	   
   }
   public static void display(int arr[][])
   {
	   for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[0].length;j++)
			 {
				System.out.print("\t"+arr[i][j]);
			 }
				System.out.println("\n");

		 }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Row size :");
		int row=sc.nextInt();
		
		System.out.println("Enter column Size");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int transpose[][]=new int[row][col]; 

		
		
		int ch;
		do
		{
			System.out.println();
			System.out.println("\t 1. Enter elements in array");
			System.out.println("\t 2. Display Array");
			System.out.println("\t 3. Sparse Array");
			System.out.println("\t 4. Transpose Array");
			System.out.println("\t 0.exit");
			System.out.println("\t Enter choice ");
			ch=sc.nextInt();
			
			 switch(ch)
			 {
			 case 1: 
				 System.out.println("Enter elements in array ");
				 for(int i=0;i<row;i++)
				 {   System.out.println(" Enter data for "+i+"row");
					 for(int j=0;j<col;j++)
					 { 
						
						 arr[i][j]=sc.nextInt();
					 }

				 }
				 break;
			 case 2: 
				 System.out.println("**********Array *********");
//				 for(int i=0;i<row;i++)
//				 {
//					 for(int j=0;j<col;j++)
//					 {
//						System.out.print("\t"+arr[i][j]);
//					 }
//						System.out.println("\n");
//
//				 }
				 display(arr);
				 break;
			 case 3:
				 int nonzero=countNonZero(arr,row,col);
				 
				 int sparse[][]=new int[nonzero+1][3];
				 sparse[0][0]=row;
				 sparse[0][1]=col;
				 sparse[0][2]=nonzero;
				 int k=1;
				 for(int i=0;i<row;i++)
				 {
					 for(int j=0;j<col;j++)
					 {
						 if(arr[i][j]!=0)
						 {
							 sparse[k][0]=i;
							 sparse[k][1]=j;
							 sparse[k][2]=arr[i][j];
							 k++;
						 } 
					 }
				 }
				
			
				 System.out.println("******* Sparse Array *******");
				 display(sparse);
					break;
			 case 4:
				 for(int i=0;i<row;i++)
				 {
					 for(int j=0;j<col;j++)
					 {
						 transpose[j][i]=arr[i][j];
					 }
				 }
				 System.out.println("******** Transpose array **********");
				 display(transpose);
				 break;
			 }
			
		}
		while(ch!=0);
		

	}

}
