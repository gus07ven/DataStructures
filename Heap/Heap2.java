package Heap;

import java.util.ArrayList;


public class Heap2 {
	
	Node root;
	
	ArrayList<Integer> arrayValues = new ArrayList<Integer>();
	
	public void display(Node input){
		if(input == null){
			return;
		}
		display(input.right);
		display(input.left);
		System.out.print("|"+ input.number +"|");
	}
	
	public Node insert(Node input, int num){
		if(input == null){
			return new Node(num);
		}
		if(num <= input.number){
			input.left = insert(input.left, num);
		} else {
			input.right = insert(input.right, num);
		}
		return input;
	}
	
	public void treeToArrayPre(Node root) {
		if (root == null) {
			return;
		}
		
		treeToArrayPre(root.left);
		treeToArrayPre(root.right);
		System.out.print(root.number + " ");
		//for (Integer integer : arrayValues) {
		//	System.out.print(" |" + integer + "| ");
		//}
	}
	
	public void siftUp(){
		
	}

	public static void main(String[] args) {
		Heap hp = new Heap();
		hp.root = new Node(25);
		hp.insert(hp.root, 36);
		hp.insert(hp.root, 26);
		hp.insert(hp.root, 49);
		hp.insert(hp.root, 41);
		hp.insert(hp.root, 30);
		hp.insert(hp.root, 12);
		hp.treeToArrayPre(hp.root);
		//hp.display(hp.root);
	}
	
}
