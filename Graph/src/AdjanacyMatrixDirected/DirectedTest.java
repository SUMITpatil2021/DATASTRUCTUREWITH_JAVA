package AdjanacyMatrixDirected;

import java.util.Scanner;

public class DirectedTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		GraphDirected g=new GraphDirected(size);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 5);
		g.addEdge(3, 6);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		
		g.display();
		g.inDegree();
		g.outDegree();

	}

}
