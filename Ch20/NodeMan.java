package Ch20;

import LinkedList.Node;

public class NodeMan {

	public class Node {

		int data;
		Node next = null;
		Node prev = null;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;

	public void add(int a) {
		
		if (head == null) {
			tail = new Node(a);
			head = tail;
		} else {
			// Add to end of existing list
			tail.next = new Node(a);
			tail = tail.next;
		}
	}

	public void display() {
		Node ref = head;
		while (ref != null) {
			System.out.println(ref.data + " ");
			ref = ref.next;
		}
	}

	public static void main(String[] args) {
		
		NodeMan n = new NodeMan();
		n.add(12);
		n.add(13);
		n.add(14);
		n.display();
	}
	
}
