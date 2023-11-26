package DoublyLiinkedList;

public class Node {
int data;
Node next,prev;
public Node(int data)
{
	this.data=data;
	next=prev=null;
}
public String toString()
{
	return "\t"+data;
}
}
