package BinaryTrees;

import java.util.ArrayList;

public class BinaryTree {

	Node head;
	Node tail;

	public Node insert(Node n, int d) {
		if (n == null) {
			return new Node(d);
		} else {
			if (d <= n.data) {
				n.left = insert(n.left, d);
			} else {
				n.right = insert(n.right, d);
			}
		}
		return n;
	}

	// Manual insert
	public Node manualInsert(Node n, int d) {
		if (n == null) {
			return new Node(d);
		} else {
			if (d == 2) {
				n.left = insert(n.left, d);
			} else {
				n.right = insert(n.right, d);
			}
		}
		return n;
	}

	/*
	 * public void display() { display(root); System.out.println(); }
	 */

	public Node insert2(Node input, int dataInput) {

		if (input == null) {
			return new Node(dataInput);
		} else {
			if (dataInput <= input.data) {
				input.left = insert2(input.left, dataInput);
			} else {
				input.right = insert2(input.right, dataInput);
			}
		}
		return input;
	}

	// Display tree values in pre-order.
	public void displayPre(Node root) {
		if (root == null) {
			return;
		}
		System.out.print("|"+ root.data + "|");
		displayPre(root.left);
		displayPre(root.right);
	}

	// Display the tree in-order.
	public void displayIn(Node root) {
		if (root == null) {
			return;
		}

		displayIn(root.left);
		System.out.print("|"+ root.data + "|");
		displayIn(root.right);
	}

	// Display the tree in post-order.
	public void displayPost(Node root) {
		if (root == null) {
			return;
		}

		displayPost(root.left);
		displayPost(root.right);
		System.out.print("|"+ root.data + "|");
	}

	// Copy tree into array, post-order.
	public void treeToArrayPost(Node root) {
		if (root == null) {
			return;
		}

		treeToArrayPost(root.left);
		treeToArrayPost(root.right);

		ArrayList<Integer> arrayValues = new ArrayList<Integer>();
		arrayValues.add(root.data);

		for (Integer integer : arrayValues) {
			System.out.print(" |" + integer + "| ");
		}
	}

	public static void main(String[] args) {

		/*
		 * BinaryTree t = new BinaryTree(); Node root = new Node(52); t.head =
		 * root; root = t.insert(root, 51); root = t.insert(root, 43); root =
		 * t.insert(root, 47); root = t.insert(root, 63); root = t.insert(root,
		 * 57); root = t.insert(root, 92); //t.display(root);
		 */

		BinaryTree t2 = new BinaryTree();
		Node root2 = new Node(1);
		t2.head = root2;
		t2.head.left = new Node(2);
		t2.head.right = new Node(3);
		System.out.print("Pre-order:");
		t2.displayPre(root2);
		System.out.println();
		System.out.println();
		System.out.print("In-order:");
		t2.displayIn(root2);
		System.out.println();
		System.out.println();
		System.out.print("Post-order:");
		t2.displayPost(root2);
		
	}
}
