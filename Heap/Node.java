package Heap;

public class Node {
	
	int number;
	Node left, right;
	
	public Node(){
		
	}
	
	public Node(int num){
		this.number = num;
	}
	
	public Node(int num, Node left, Node right){
		this.number = num;
		this.left = left;
		this.right = right;
	}
}
