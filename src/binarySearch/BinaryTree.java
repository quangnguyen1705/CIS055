package binarySearch;

public class BinaryTree {
	 public Node root;
	    
	    public BinaryTree()
	    {
	        root = null;
	    }
	    
	    public void insert(int n)
	    {
	        Node current = root;
	        Node newNode = new Node();

	        newNode.data = n;
	        newNode.left = null;
	        newNode.right = null;

	        if (root == null)
	            root = newNode;
		else
	            while(true)
	                if (newNode.data > current.data)
	                    if (current.right == null)
	                    {
	                        current.right = newNode;
	                        break;
	                    }
	                    else
	                        current = current.right;
	                else
	                    if (current.left == null)
	                    {
	                        current.left = newNode;
	                        break;
	                    }
	                    else
	                        current = current.left;
	    }

	    public Node search(int n)
	    {
	        Node current = root;

	        while (current != null)
	            if (current.data == n)
	                return current;
	            else if (current.data > n)
	                current = current.left;
	            else
	                current = current.right;
	        return null;
	    }
	    
	    private Node getSuccessor(Node removedNode)
	    {
	        Node successorParent = removedNode;
	        Node successor = removedNode;
	        Node current = successor.right;

	        while (current != null)
	        {
	            successorParent = successor;
	            successor = current;
	            current = current.left;
	        }
	        
		if (successor != removedNode.right)
		{
	            successorParent.left = successor.right;
	            successor.right = removedNode.right;
		}

	        return successor;
	    }
	    
	    public boolean remove(int n)
	    {
	        // Check empty tree
	        if (root == null)
	            return false;

	        // Prepare search for node
	        Node current = root;
	        Node parent = root;
	        boolean currentIsLeft = true;
		while (current.data != n)
		{
	            // currentIsLeft is true when current is finds n
	            // and is a “left” child of parent
	            parent = current;
	            if (current.data > n)
	            {
	                currentIsLeft = true;
	                current = current.left;
	            }
	            else
	            {
	                currentIsLeft = false;
	                current = current.right;
	            }

	            // If current is null, node n was not found
	            if (current == null)
	                    return false;
		}

		// At this point, current is the node to delete
		// Now, we check for the situations
		// Situation 1 - leaf node
		if (current.left == null && current.right == null)

	            // Check if current node is root
	            if (parent == current)
	                root = null;

	            // Check which child pointer of parent to set
	            else if (currentIsLeft)
	                parent.left = null;
	            else
	                parent.right = null;

		// Situation 2 - one child. Parent inherits child
		// or if current is root, root takes child
		else if (current.left == null)
	            if (parent == current)
	                root = current.right;
	            else if (currentIsLeft)
	                parent.left = current.right;
	            else
	                parent.right = current.right;
		else if (current.right == null)
	            if (parent == current)
	                root = current.left;
	            else if (currentIsLeft)
	                parent.left = current.left;
	            else
	                parent.right = current.left;

		// Situation 3: two children
		else
		{
	            Node successor = getSuccessor(current);

	            // Replace current node with successor
	            if (parent == current)
	                root = successor;
	            else if (currentIsLeft)
	                parent.left = successor;
	            else
	                parent.right = successor;

	            // Successor will always come from the right, so
	            // it must also take deleted node’s left child
	            successor.left = current.left;
		}
		return true;
	    }

	    public boolean update(int oldValue, int newValue)
	    {
	        Node n = search(oldValue);
	        if (n == null)
	            return false;
	        
	        remove(oldValue);
	        insert(newValue);
	        return true;
	    }
	    
	    public void displayInOrder(Node current, int level)
	    {
	        if (current != null)
	        {
	            displayInOrder(current.left, level + 1);
	            System.out.printf("%d: %d\n", level, current.data);
	            displayInOrder(current.right, level + 1);
	        }
	    }
	    
	    public void displayPreOrder(Node current, int level)
	    {
	        if (current != null)
	        {
	            System.out.printf("%d: %d\n", level, current.data);
	            displayPreOrder(current.left, level + 1);
	            displayPreOrder(current.right, level + 1);
	        }
	    }
	    
	    public void displayPostOrder(Node current, int level)
	    {
	        if (current != null)
	        {
	            displayPostOrder(current.left, level + 1);
	            displayPostOrder(current.right, level + 1);
	            System.out.printf("%d: %d\n", level, current.data);
	        }
	    }
	    
	    public void display()
	    {
	        displayInOrder(root, 0);
	    }
	    
	    public Node minimum()
	    {
	        if (root == null)
	            return null;
	        
	        Node current = root;
	        while (current.left != null)
	            current = current.left;
	        return current;
	    }

	    public Node maximum()
	    {
	        if (root == null)
	            return null;
	        
	        Node current = root;
	        while (current.right != null)
	            current = current.right;
	        return current;
	    }
}
