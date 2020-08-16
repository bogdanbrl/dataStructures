package stack_with_linked_list;

public class Main {

	public static void main(String[] args) {
		
		LinkedStack stack = new LinkedStack();
		stack.push(new Employee("Jane", "Jones", 163));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));
		
		stack.printStack();

	}

}

