package stack;

public class StackIsEmptyException extends RuntimeException {
String msg;
public  StackIsEmptyException()
{
	msg="Stack is Empty!!!";
}

public String getMessage()
{
	return msg;
}
}
