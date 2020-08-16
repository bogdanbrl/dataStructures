package queues_arrayImpl;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(mikeWilson);
		queue.add(marySmith);
		queue.add(johnDoe);
		queue.add(janeJones);

		queue.printQueue();
		System.out.println("\n==================");
		queue.remove();
		queue.printQueue();
		System.out.println("\n==================");
		System.out.println(queue.peek());
		System.out.println("\n==================");
		queue.printQueue();
		
		
	}

}
