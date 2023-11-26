package PriorityQueue;

public class Element {
	int data;
	int pri;
	public Element(int data,int pri)
	{
		this.data=data;
		this.pri=pri;
	}
	public String toString()
	{
		return "[ "+data+" "+pri+" ]";	
	}
}
