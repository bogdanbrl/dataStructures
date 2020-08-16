package doubly_linked_list;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if(head == null) {
			tail = node;
		}else {
			head.setPrevious(node);
		}
		
		head = node;
		size++;
	}
	
	public void  addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if(tail == null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		
		tail = node;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode nodeToBeRemoved = head;
		
		if(head.getNext() == null) {
			tail =null;
		}else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		nodeToBeRemoved.setNext(null);
		return nodeToBeRemoved;
	}
	
	public EmployeeNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode nodeToBeRemoved = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		}else {
			// noului tail i se atribuie penultima valoare si se seteaza ca ultimul element din lista (devine tail, adica urmatoarea valoare dupa el este null)
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		size--;
		nodeToBeRemoved.setPrevious(null);
		return nodeToBeRemoved;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			if(current.getNext() != null) {
				System.out.print(" <-> ");
			}else {
				System.out.print(" -> ");
			}
			current = current.getNext();
		}
		System.out.print("null");
	}
}
