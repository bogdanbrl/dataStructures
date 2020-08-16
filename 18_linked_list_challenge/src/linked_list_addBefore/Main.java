package linked_list_addBefore;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println("\nEmployeeDoublyLinkedList size: " + list.getSize());
		
		Employee billEnd = new Employee("Bill", "End", 78);
		
		list.addToEnd(billEnd);
		list.printList();
		System.out.println("\nEmployeeDoublyLinkedList size: " + list.getSize());
		
		list.removeFromFront();
		list.printList();
		System.out.println("\nEmployeeDoublyLinkedList size: " + list.getSize());
		
		list.removeFromEnd();
		list.printList();
		System.out.println("\nEmployeeDoublyLinkedList size: " + list.getSize());
		
		System.out.println("\n============addBefore==============");
		list.addBefore(new Employee("Someone", "Else", 1111), janeJones);
		list.printList();
		System.out.println("\nEmployeeDoublyLinkedList size: " + list.getSize());
		
		
	}

}