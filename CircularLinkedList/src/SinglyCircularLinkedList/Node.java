package SinglyCircularLinkedList;

public class Node {
	int data;
	Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int data)
	{
		this.data=data;
		
		this.next=null;
	}
	
	public String toString()
	{
		return " "+data;
	}
}
