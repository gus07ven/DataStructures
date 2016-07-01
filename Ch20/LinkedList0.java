package Ch20;

public class LinkedList0 {

	private class Node {

		String value;
		Node next;

		Node(String val, Node n) {

			value = val;
			next = n;
		}

		Node(String val) {

			value = val;
			next = null;
		}
	}

		Node head = null;
/*
	public LinkedList0() {
			head = new Node("Debby");
			head.next = new Node("Elaine");
			head.next.next = new Node("Fred");
			head = new Node("Chuck", head);

			String[] names = { "Bob", "Allan" };

			for (String s : names) {
				head = new Node(s, head);
			}
		}
	*/
	
	/*
	public LinkedList0(){
		head = new Node("Green");
		head.next = new Node("Blue");
		head = new Node("Red", head);		
	}
*/
		
	public LinkedList0(){
		Node colorList = new Node("Yellow", new Node("Purple"));
		colorList = new Node("Brown", colorList);
		System.out.println(colorList.value);
		System.out.println(colorList.next.value);
		System.out.println(colorList.next.next.value);
	}
		public void print(){

			Node ref = head;
			while (ref != null) {

				System.out.print(ref.value + " ");
				ref = ref.next;
			}
		}
		
		public static void main(String[] args) {
			
			LinkedList0 l1 = new LinkedList0();
			//String str = "The contents of the list are:";
			//System.out.println(str);
			//l1.print();
			//l1.print();
		}
	}

