package DoubleEndedQueue;

public class Node {
	int data;
	Node next;
	public Node()
	{
		next=null;
	}
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	
//	public String toString()
//	{
//		return "\t"+data;
//	}
}
