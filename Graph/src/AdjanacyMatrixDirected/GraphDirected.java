package AdjanacyMatrixDirected;

public class GraphDirected {
	int ver;
	int arr[][];
	public GraphDirected(int ver)
	{
		this.ver=ver;
		arr=new int[ver][ver];
	}

	public void addEdge(int i,int j)
	{
		arr[i][j]=1;
	}


	public void outDegree()
	{   
		System.out.println("----------------------------------------------------------------");
		int count=0;
		for(int i=0;i<ver;i++)
		{   count=0;
		for(int j=0;j<ver;j++)
		{
			if(arr[i][j]==1)
			{
				count++;
			}
		}

		System.out.println("Outdegree of "+i+" is :"+count);
		}
	}
	public void inDegree()
	{
		System.out.println("-----------------------------------------------------------------");
		int count=0;
		for(int i=0;i<ver;i++)
		{	
			count=0;
			for(int j=0;j<ver;j++)
			{
				if(arr[j][i]==1)
				{
					count++;	
				}
			}

			System.out.println("Indegree of "+i+" is :"+count);
		}
	}

	public void display()
	{
		System.out.println("---------------------------------------------------------------");
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
