package BinaryTree;

public class Node {
int data;
Node right,left;
public Node(int data)
{
this.data=data;
right=left=null;
}
public  String toString()
{
	return " "+data;
}

}
