package String_LinkedList;

public class Node {
	public String str;
	public Node link;
	public Node()
	{
		str="NA";
		link=null;
	}
	public Node(String str)
	{
		this.str=str;
		this.link=null;
	}
	
	public String getStr()
	{
		return str;
	}
	
	public Node getLink()
	{
		return link;
	}
	public void setStr(String str)
	{
		this.str=str;
	}
	
	public void setLink(Node link)
	{
		this.link=link;
	}
	
	public String toString()
	{
		return "\n\t[ String :  "+str+"\t Link : "+link;
	}
	}
	
	


