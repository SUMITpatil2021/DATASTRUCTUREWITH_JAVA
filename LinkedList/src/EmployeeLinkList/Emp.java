package EmployeeLinkList;

public class Emp {
	private int eid;
	private String name;

	public Emp()
	{
		eid=0;
		name="NA";

	}
	public Emp(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	} 
	
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
	this.name=name;
	}
	
	public String toString()
	{
		return "\n[ "+eid+" "+name+"]";
	}
}

