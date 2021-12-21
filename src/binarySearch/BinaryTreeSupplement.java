package binarySearch;

public class BinaryTreeSupplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t = new BinaryTree();

		t.insert(5);
		t.insert(4);
		t.insert(9);
		t.insert(2);
		t.insert(1);
		t.insert(6);
		t.insert(3);
		t.insert(7);
		t.insert(8);
		t.insert(0);

		t.display();

//		System.out.println();
//		Node n;
//		n = t.search(20);
//		System.out.print(n == null ? "20 Not Found\n" : n);
//		n = t.search(12);
//		System.out.print(n == null ? "12 Not Found\n" : n);
//
		System.out.println();
		t.remove(0);
		t.display();
		System.out.println("---------------------");
		t.remove(2);
		t.display();
		System.out.println("---------------------");
		t.remove(9);
		t.display();
//
//		System.out.println();
//		t.update(15, 5);
//		t.display();
//
		System.out.println();
		System.out.println("Pre Order");
		t.displayPreOrder(t.root, 0);
		
		System.out.println();
		System.out.println("Post Order");
		t.displayPostOrder(t.root, 0);
//
//		System.out.println();
//		n = t.minimum();
//		System.out.print(n == null ? "Empty tree\n" : n);
//		n = t.maximum();
//		System.out.print(n == null ? "Empty tree\n" : n);
	}

}
