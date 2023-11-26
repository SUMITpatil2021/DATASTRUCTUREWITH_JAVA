package Int_LinkedList;

public class Node {
	int data;
	Node link;
	public Node()
	{
		data=1;
		link=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.link=null;
	}
	
	//Getter setter used for accesing private data members. here we data members are accsicble within package so dot need.
//	public int  getData()
//	{
//		return data;
//	}
//	public Node getLink()
//	{
//		return link;
//	}
	public String toString()
	{
		return "\n\t[ Data:"+data+"\t Link: "+link;
	}
	
	
}
