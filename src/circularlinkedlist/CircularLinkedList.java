package circularlinkedlist;

/**
 * Filename: CircularLinkedList.java
 */

// Circular Linked List Class
public class CircularLinkedList {
	// attributes
	public Node current;
	public int currentSize;

	// constructor
	public CircularLinkedList() {
		current = null;
		currentSize = 0;
	}

	// methods
	// create a node from an integer
	public Node createNode(int n) {
		Node newNode = new Node();
		newNode.data = n;
		return newNode;
	}

	// insert after current
	void insertAfterCurrent(int n) {
		Node p = createNode(n); // create a node from an integer value n
		if (currentSize == 0) { // list is empty
			current = p;
			current.next = current;
		} else { // list has more than 1 node
			p.next = current.next;
			current.next = p;
			current = p;
		}
		currentSize++;
	}

	// insert before current
	void insertBeforeCurrent(int n) {
		Node p = createNode(n); // create a node from an integer value n
		if (currentSize == 0) { // list is empty
			current = p;
			current.next = current;
		} else { // list has more than 1 node
			p.next = current;
			for (int i = 1; i < currentSize; i++) {
				current = current.next;
			}
			current.next = p;
			current = p;
		}
		currentSize++;
	}

	// search
	Node search(int n) {
		if (currentSize == 0) {
			return null;
		}
		for (int i = 1; i <= currentSize; i++) {
			if (current.data == n) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	// update
	boolean update(int o, int n) {
		Node nodeToChange = search(o);
		if (nodeToChange == null) {
			return false;
		} else {
			nodeToChange.data = n;
			return true;
		}
	}


	// delete
	boolean deleteNode(int n) {
		Node nodeToDelete = search(n);
		if (nodeToDelete == null) {
			return false;
		} else {
			Node nodeAfterCurrent = current.next;
			for (int i = 1; i < currentSize; i++) {
				current = current.next;
			}
			current.next = nodeAfterCurrent;
			current = current.next;
			nodeToDelete = null;
			currentSize--;
			return true;
		}
	}

	// print size
	void printSize() {
		System.out.println(String.format("The list has %d elements", currentSize));
	}

	// print current
	void printCurrent() {
		if (currentSize == 0) {
			System.out.println("Empty List");
		} else {
			System.out.println(String.format("The current element is %d", current.data));
		}
	}

	// print list
	void printList() {
		if (currentSize == 0) {
			System.out.println("Empty List");
		} else {
			System.out.print("\n");
			for (int i = currentSize; i > 0; i--) {
				System.out.print(String.format("%d-> ", current.data));
				current = current.next;
			}
		}
	}
}