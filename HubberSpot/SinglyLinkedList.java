package HubberSpot;

public class SinglyLinkedList {

	// private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display(ListNode n) {
		ListNode ref = n;
		if (ref == null) {
			return;
		}
		ListNode current = n;
		while (current != null) {
			System.out.print(current.data + " ---> "); // print current
														// element's data.
			current = current.next;
		}
		System.out.println(current);
	}

	public ListNode insertAtBeginning(ListNode head, int d) {
		ListNode newNode = new ListNode(d);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	public ListNode insertAtEnd(ListNode head, int d) {
		ListNode newNode = new ListNode(d);
		if (head == null) {
			return newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			return head;
		}
	}
	
	public void insertAfter(ListNode previous, int d){
		ListNode newNode = new ListNode(d);
		if(previous == null){
			System.out.println("The previous node can't be null.");
			return;
		} else {
			newNode.next = previous.next;
			previous.next = newNode;
		}
	}

	public int length(ListNode n) {
		int counter = 0;
		if (n == null) {
			return 0;
		} else {
			ListNode current = n;
			while (current != null) {
				counter++;
				current = current.next;
			}
		}
		System.out.print(counter);
		return counter;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		ListNode fifth = new ListNode(27);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		SinglyLinkedList s = new SinglyLinkedList();
		s.display(second);
		ListNode newHead = s.insertAtBeginning(head, 15);
		s.display(newHead);
		s.insertAtEnd(newHead, 30);
		s.display(newHead);
		s.insertAfter(fifth, 4);
		s.display(newHead);
	}
}
