package StackWithLinkedList;

public class StackisEmptyException extends RuntimeException {
 
	String msg;
	public StackisEmptyException(String str)
	{
		msg=str;
	} 
	public String getMessage()
	{
		return msg;
	}
	
	
}
