package queue_from_JDK;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import queue_circular.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		Queue<Employee> queue = new LinkedList<Employee>();
		// Queue<Employee> queue2 = new ArrayBlockingQueue<Employee>(10); nu mai poate sa fie alocata memorie
	
		queue.add(janeJones);
		queue.add(marySmith);
		queue.add(billEnd);
		queue.add(mikeWilson);
		queue.add(johnDoe);
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n\n======================\n\n");
		
		for (Employee employee : queue) {
			System.out.println(employee);
		}
		
		System.out.println("\n\n============ forEachRemaining ==========\n\n");
		
		Iterator itr2 = queue.iterator();
		itr2.forEachRemaining(emp -> {
			System.out.println(emp);
		});
	}

}
