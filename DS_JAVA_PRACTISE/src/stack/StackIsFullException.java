package stack;

public class StackIsFullException extends RuntimeException {
String msg;
public StackIsFullException()
{
	msg="Stack is Full !!!";
}
public String getMessage()
{
	return msg;
}
}
