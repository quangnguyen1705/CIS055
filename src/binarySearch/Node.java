package binarySearch;

public class Node {
	public int data;
    public Node left;
    public Node right;
    
    public Node()
    {
        data = -1;
        left = null;
        right = null;
    }
    
    public String toString()
    {
        return String.format("%d\n", data);
    }
}
