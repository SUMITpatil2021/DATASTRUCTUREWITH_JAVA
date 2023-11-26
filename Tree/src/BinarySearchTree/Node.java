package BinarySearchTree;

public class Node {
	int data;
	Node left,right,next;

	public Node(int data)
	{
		this.data=data;
		left=right=next=null;
	}
	public String toString()
	{
		return " "+data;
	}
}
