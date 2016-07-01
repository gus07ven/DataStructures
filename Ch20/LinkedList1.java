package Ch20;

import java.security.acl.LastOwnerException;

public class LinkedList1 {
	
	private class Node{
		String value;
		Node next;
		
		Node(String val, Node n){
			this.value = val;
			this.next = n;
		}
		
		Node(String val){
			this(val, null);
		}
	}

	private Node head;
	private Node tail;
	
	public LinkedList1(){
		head = null;
		tail = null;
	}
	
	public boolean isEmpty(){
		
		return head == null;
	}
	
	public int size(){
		int count = 0;
		Node p = head;
		while(p != null){
			count++;
			p = p.next;
		}
		return count;
	}
	
	public void add(String e){
		if(isEmpty()){
			head = new Node(e);
			tail = head;
		} else {
			tail.next = new Node(e);
			tail = tail.next;
		}
	}
	
	public void add(int index, String e){
		if (index < 0 || index > size()){
			String message = String.valueOf(index);
			throw new IndexOutOfBoundsException(message);
		}
		
		if(index == 0){
			head = new Node(e, head);
			if(tail == null)
				tail = head;
			return;
		}
		
		Node pred = head;
		for(int k = 1; k <= index - 1; k++){
			pred = pred.next;
		} 
		
		pred.next = new Node(e, pred.next);
		
		if(pred.next.next == null)
			tail = pred.next;
	}
	
	public String toString(){
		
		StringBuilder strBuilder = new StringBuilder();
		
		Node p = head;
		while(p != null){
			strBuilder.append(p.value + "\n");
			p = p.next;
		}
		return strBuilder.toString();
	}
	
	public String remove(int index){
		if(index < 0 || index >= size()){
			String message = String.valueOf(index);
			throw new IndexOutOfBoundsException(message);
		}
		
		String element = null; 
		if(index == 0){
			element = head.value;
			head = head.next;
			if(head == null){
				tail = null;
			}
			else {
				Node pred = head;
				for(int k = 1; k <= index - 1; k++)
					pred = pred.next;
				element = pred.next.value;
				pred.next = pred.next.next;
				if(pred.next == null)
					tail = pred;
			}
		}
		return element;
	}
	
	public boolean remove(String element){
		
		if(isEmpty())
			return false;
		
		if(element.equals(first.value))
		{
			head = head.next;
			if(head == null)
				tail = null;
			return true;
		}
	}
}
