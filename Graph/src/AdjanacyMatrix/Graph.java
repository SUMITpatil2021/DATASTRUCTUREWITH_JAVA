package AdjanacyMatrix;

import java.util.Scanner;

public class Graph {
	
	int ver;
	int arr[][];
	Scanner sc=new Scanner(System.in);
	public Graph(int ver)
	{
		this.ver=ver;
		arr=new int[ver][ver];
	}
	public void acceptGraph()
	{ 
		for(int i=0;i<ver;i++)
		{
			for(int j=0;j<ver;j++)
			{
				System.out.println("Enter adjancency for"+i+ " and "+j +" [0.not adjacent  1.Adjacent ]");
				int no=sc.nextInt();
				arr[i][j]=no;
			}
		}
		}
	
	public void addEdge(int i,int j)  // for undirected graph
	{
		arr[i][j]=1;
		arr[j][i]=1;
	}
	
	public void display()
	{ System.out.println("---------------------------------------------------------");
		for(int i=0;i<ver;i++)
		{ 
			System.out.println();
			for(int j=0;j<ver;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}

	}
