package stack_with_arrays;

public class Main {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("Jane", "Jones", 163));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));
		
		stack.printStack();
		System.out.println("\n");
		System.out.println(stack.peek());
		System.out.println("\n");
		System.out.println(stack.pop());
		System.out.println("\n");
		stack.printStack();

	}

}
