package DFSTraversal;

public class GraphDFS {
int ver;
int arr[][];
public GraphDFS(int ver)
{
	this.ver=ver;
	arr=new int[ver][ver];
}

public void  addEdge(int i,int j)
{
	arr[i][j]=1;
	arr[j][i]=1;
}
public void dfs(int start)
{
	boolean v[]=new boolean[ver];
	v[start]=true;
	System.out.print("\t"+start);
	travDFS(start,v);
}

public void travDFS(int start, boolean v[])
{
	for(int i=0;i<ver;i++)
	{
		if(arr[start][i]==1 && v[i]==false)
		{
			v[i]=true;
			System.out.print("\t"+i);
			travDFS(i,v);
		}
	}
}

public void display()
{
	System.out.println("-------------------------------------------------------------");
	for(int i=0;i<ver;i++)
	{
		for(int j=0;j<ver;j++)
		{
			System.out.print("\t"+arr[i][j]);
			
		}
		System.out.println();
	}
}

}
