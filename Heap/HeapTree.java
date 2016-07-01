package Heap;

public class HeapTree {
	
	NodeH head;
	
	//Insert to NodeH n a new number value
	public NodeH insert(NodeH n, int num){
		//If num is the first value in the tree
		if(n == null){
			return new NodeH(num);
		} else {
		// If there are other values in n already.
			if(num <= n.number){
				n.left = insert(n.left, num);
			} else {
				n.right = insert(n.right, num);
			}
		}
		return n;
		}
		
	
	public void display(NodeH n){
		if(n == null){
			return;
			} else {
				
		display(n.left);
		display(n.right);
				
		System.out.println(n.number + " ");					
		}
	}
	
	public static void main(String[] args) {
		
		HeapTree h = new HeapTree();
		NodeH root = new NodeH(27);
		h.head = root;
		root = h.insert(root, 17);
		root = h.insert(root, 33);
		root = h.insert(root, 45);
		root = h.insert(root, 4);
		h.display(root);		
	}
}
	

