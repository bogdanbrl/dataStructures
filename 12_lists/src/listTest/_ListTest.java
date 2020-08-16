package listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class _ListTest {

	public static void main(String[] args) {
		
		List<_Employee> employeeList = new ArrayList<>();		
		employeeList.add(new _Employee("Jane", "Jones", 123));
		employeeList.add(new _Employee("John", "Doe", 4567));
		employeeList.add(new _Employee("Mary", "Smith", 22));
		employeeList.add(new _Employee("Mike", "Wilson", 3245));
		
		employeeList.forEach(Employee -> System.out.println(Employee));

		System.out.println("\n\n=========================\n");
		
		_Employee [] employeeArray = employeeList.toArray(new _Employee[employeeList.size()]);
		for (_Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new _Employee("Jane", "Jones", 123)));		//va afisa false pentru ca am creat o noua instatnta.
																							// prin urmare trebuie folositametoda equals pe care o vomadauga in clasa _Employee
						
		
		System.out.println(employeeList.contains(new _Employee("Bogdan", "Masonul", 888)));		//not yet
		
	}

}
