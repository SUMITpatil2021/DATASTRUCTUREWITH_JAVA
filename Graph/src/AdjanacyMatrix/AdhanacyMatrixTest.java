package AdjanacyMatrix;

import java.util.Scanner;

public class AdhanacyMatrixTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=sc.nextInt();
		Graph g=new Graph(size);
		
//		g.acceptGraph();
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(2,1);
		g.addEdge(3,1);
		g.addEdge(3,2);
		
		g.display();

	}

}
