package vectorTest;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new Vector<>();		
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		employeeList.forEach(Employee -> System.out.println(Employee));

		System.out.println("\n\n=========================\n");
		
		Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new Employee("Jane", "Jones", 123)));		//va afisa false pentru ca am creat o noua instanta.
																							// prin urmare trebuie folosita metoda equals pe care o vomadauga in clasa _Employee
						
		
		System.out.println(employeeList.contains(new Employee("Bogdan", "Masonul", 888)));		//not yet
		
	}

}
