package Project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LinkedList {

	Node head;
	Node tail;

	// Load employees from text file to linked list. 
	public void loadEmployee() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\src\\Project2\\employee.txt");
		BufferedReader br = new BufferedReader(fr); 
		String line;

		Node e;
		while ((line = br.readLine()) != null) { 
			e = new Node();
			StringTokenizer st = new StringTokenizer(line); 
			int counter = 0;

			while (st.hasMoreTokens()) { 
				String token = st.nextToken();
				if (head == null) {
					if (counter == 0) {
						e.name = token;
						counter++;
					} else {
						e.manager = token;
						counter--;
						head = e;
						tail = head;
					}
				} else {
					if (counter == 0) {
						e.name = token;
						counter++;
					} else {
						e.manager = token;
						counter--;
					}
					tail.next = e;
					tail = e;
				}
			}
		}
		br.close();
	}

	// Search for employee in the list. 
	public String search(String n) {
		Node ref = head;
		if (ref != null) {
			while (!ref.name.equals(n)) {
				if (ref.next == null) {
					String msg = n + " was not found in the list.";
					System.out.println(msg);
					return msg;
				} else {
					ref = ref.next;
				}
			}
		}
		String foundName = ref.name + " was found in the list.";
		System.out.println(foundName);
		return foundName;
	}

	// Insert employee to list at specified location p. 
	public void insert(String n, String m, int p) {
		Node inNode = new Node(n, m);
		Node ref = head;
		Node current = ref;
		int counter = 1;
		if (current == null) {
			System.out
					.println("The list is empty. The name has been inserted as"
							+ " the first name on the list.");
			head = inNode;
			tail = inNode;
		} else {
			if (p == 1) {
				inNode.next = ref;
				head = inNode;
			} else {
				while (current.next != null && counter != p) {
					ref = current;
					current = ref.next;
					counter++;
				}
				if (counter == p) {
					inNode.next = current;
					ref.next = inNode;
				} else {
					System.out
							.println("The node has been inserted at the end of the list.");
					current.next = inNode;
					current = inNode;
				}
			}
		}
	}

	public void add(String name, String manager) {
		Node n = new Node();
		if (head == null) {
			n.name = name;
			n.manager = manager;
			head = n;
			tail = head;
		} else {
			n.name = name;
			n.manager = manager;
			tail.next = n;
			tail = n;
		}
	}

	// Remove employee from list by name.
	public String remove(String n) {
		Node ref = head;
		Node prev = head;
		if (ref != null) {
			while (!ref.name.equals(n)) {
				if (ref.next == null) {
					String msg = n + " is not in the list.";
					System.out.println(msg);
					return msg;
				} else {
					prev = ref;
					ref = ref.next;
				}
			}
		}
		String foundName = ref.name + " has been deleted from the list";
		System.out.println(foundName);
		prev.next = ref.next;
		return foundName;
	}

	// Print employee list in current order.
	public void display() {
		Node ref = head;
		while (ref != null) {
			System.out.println("Employee: " + ref.name + "  Manager: "
					+ ref.manager);
			ref = ref.next;
		}
		System.out.println();
	}

	// Print employee list in reverse order.
	public void reverseDisplay(Node input) {
		if (input == null)
			return;
		reverseDisplay(input.next);
		System.out.println("Employee: " + input.name + "  Manager: "
				+ input.manager);
	}

	// Sorts employee names in descending order.
	public void sort(Node input) {

		Node head = input;
		Node insertionNode = head;
		Node currentNode = input.next;

		while (currentNode != null) {
			insertionNode = head;

			while (insertionNode.next != currentNode) {
				if (insertionNode.name.compareTo(currentNode.name) <= 0) {
					String tempName = currentNode.name;
					String tempManager = currentNode.manager;
					currentNode.name = insertionNode.name;
					currentNode.manager = insertionNode.manager;
					insertionNode.name = tempName;
					insertionNode.manager = tempManager;
				} else {
					insertionNode = insertionNode.next;
				}
			}
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		LinkedList list = new LinkedList();
		
		System.out.println("-----Load employees-----");
		list.loadEmployee();
		list.display();
		
		System.out.println("-----Search if employee is in the list-----");
		list.search("Bob");
		System.out.println();
		
		System.out.println("-----Add employee at end of list-----");
		list.add("Gustavo", "Dawit");
		list.display();
		
		System.out.println("---Remove employee from the list-----");
		list.remove("Dilbert");
		list.display();
		
		System.out.println("-----Insert employee at specified location (3 in this case)-----");
		list.insert("Tommy", "Andrew", 3);
		list.display();
		
		System.out.println("-----Print current employee list---");
		list.display();
		
		System.out.println("-----Print same list in reverse order-----");
		list.reverseDisplay(list.head);
		System.out.println();
		
		System.out.println("-----Sort list of employees descending order-----");
		list.sort(list.head);
		list.display();

	}
}
