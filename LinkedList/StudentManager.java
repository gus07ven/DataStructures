package LinkedList;

public class StudentManager {

	Node2 head;
	Node2 tail;

	public void insert(String name) {
		head = new Node2();
		head.name = name;
		tail = head;
	}

	public void add(String name) {
		Node2 n = new Node2();	
		if(head == null) {
			
			head = n;
			tail = head;
			
		}	
		n.name = name;
		tail.next = n;
		tail = n;
	}

	public void remove(String name) {

		Node2 tem = head;
		Node2 prev = head;
		
		while (tem.name != name) {
			prev = tem;
			tem = tem.next;

			if (tem.name == name) {
				prev.next = tem.next;
				tem.next = null;
			}	
		}
	}
	
	
public void display(){
			 Node2 ref = head;
			 while(ref != null){
				 System.out.print(ref.name + " ");
				 ref = ref.next;
			 }
			 System.out.println();
			}

public void reverseDisplay(Node2 a){
	
	 if( a == null)
	 return;
	 reverseDisplay(a.next);
	 System.out.print(a.name + " ");
	 }

public Node2 partition(Node2 node){
		
	  Node2 left = head;
	  Node2 right = tail;
      Node2 i = left, j = right;
      Node2 tmp;
      Node2 pivot = node[(left + right) / 2];
     
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };      
      return i;
}
 
public void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}


		
	public static void main(String[] args) {
		
		StudentManager m = new StudentManager();
	    m.add("Gustavo");
		m.add("Manuel");
		m.add("Luis");
		m.add("Mariano");
		m.remove("Gustavo");
		m.display();
		
	}

}
