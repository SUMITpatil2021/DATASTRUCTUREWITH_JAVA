package EmployeeLinkList;

public class Node {
	private Node next;
	private Emp data;
	public Node()
	{
		next=null;
		data=null;
	}
	public Node(Emp data)
	{
		this.data=data;
		next=null;
	} 
	
	public void setData(Emp data)
	{
		this.data=data;
	}
	public Emp getData()
	{
		return data;	
	} 
	
	public void setNext(Node Next)
	{
		this.next=Next;
	}
	
	public Node getNext()
	{
		return next;
	} 
	

	public String toString()
	{
		return data+" ";
	}
}
