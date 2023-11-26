package DFSTraversal;

import java.util.Scanner;

public class DFSTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		
		int size=sc.nextInt();
		GraphDFS g=new GraphDFS(size);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 2);
		g.addEdge(3, 6);
		g.addEdge(4, 1);
		g.addEdge(4, 2);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(5, 1);
		g.addEdge(5, 4);
		g.addEdge(5, 6);
		g.addEdge(6,3);
		g.addEdge(6,4);
		g.addEdge(6,5);
		
		g.display();
		System.out.println("Enter the start ");
		int start=sc.nextInt();
		
		g.dfs(start);
		
	}

}
