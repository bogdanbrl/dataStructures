package queue_circular;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		CircularQueue queue = new CircularQueue(10);
		
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.remove();
		queue.add(marySmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(janeJones);
		queue.printQueue();
		
		System.out.println("Marime queue: " + queue.size());
		
		
		
//		queue.add(janeJones);
//		queue.add(johnDoe);
//		queue.add(marySmith);
//		queue.add(mikeWilson);
//		queue.add(billEnd);		
//		
//		System.out.println("Marime queue: " + queue.size());
//
//		
//		
//		
//		queue.printQueue();
//		System.out.println("\n==================");
//		queue.remove();
//		queue.printQueue();
//		System.out.println("\n==================");
//		System.out.println(queue.peek());
//		System.out.println("\n==================");
//		queue.printQueue();
		
		
	}

}
