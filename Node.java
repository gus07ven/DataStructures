package Project2;

public class Node {

	public String name;
	public String manager;
	public Node next;
	
	public Node(){
		this.name = null;
		this.manager = null;
	}
	
	public Node(String name, String manager) {
		this.name = name;
		this.manager = manager;
	}
}
