package EmployeeLinkList;

public class LinkedList {
 private Node head;
 public LinkedList()
 {
	 head=null;
 }
 public void addNode(Emp record)
 {
	 Node data=new Node(record);
	 if(head==null)
	 head=record;
	 
	 
 }
}
