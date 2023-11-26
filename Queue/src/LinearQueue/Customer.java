package LinearQueue;

public class Customer {
 
	private int id;
	private String name;
	public Customer()
	{
		
	}
	public Customer(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "\n [ ID :"+id+" Name : "+name+"]";
	}
	
}
