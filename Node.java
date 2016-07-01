package Project3;

public class Node {
	
	String name;
	String department;
	Node left;
	Node right;
	
	public Node(){
	
	}
	
	public Node(String name){
		this.name = name;
	}
	
	public Node(String name, String department){
		this.name = name;
		this.department = department;
		this.left = null;
		this.right = null;
	}
}
