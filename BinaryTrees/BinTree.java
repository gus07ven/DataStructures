package BinaryTrees;

public class BinTree {

	Nod root;
	int counter = 0;

	// insert method
	public Nod insert(Nod n, int d) {
		if (n == null) {
			return new Nod(d);
		} else {
			if (d <= n.data) {
				n.left = insert(n.left, d);
			} else {
				n.right = insert(n.right, d);
			}
		}
		return n;
	}

	// display method
	public void display(Nod root) {
		if (root == null) {
			return;
		}
		display(root.left);
		display(root.right);
		System.out.println(root.data);
	}

	// evenBranches
	public void evenBranches(Nod root) {
		if (root == null) {
			return;
		}
		evenBranches(root.left);
		evenBranches(root.right);
		if (root.data % 2 == 0) {
			if (root.left != null) {
				counter++;
			}
		}
	}
	
	//return count
	public int counter(){
		System.out.println("The number of even branches that are not leafs = " + counter);
		return counter;
	}

	public static void main(String[] args) {

		BinTree b = new BinTree();
		Nod root = new Nod(2); 
		b.root = root; 
		root = b.insert(root, 1);
		root = b.insert(root, 8);
		root = b.insert(root, 0);
		root = b.insert(root, 7);
		root = b.insert(root, 6);
		root = b.insert(root, 9);
		root = b.insert(root, 4);
		b.display(root);
		b.evenBranches(root);
		b.counter();
	}
}
