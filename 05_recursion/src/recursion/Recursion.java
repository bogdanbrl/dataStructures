package recursion;

public class Recursion {

	// calculeaza factor real
	// 1! = 1 * 0! 
	// 2! = 2 * 1 = 2 * 1!
	// 3! = 3 * 2 * 1 = 3 * 2!
	// 4! = 4 * 3 * 2 * 1 = 4 * 3!
	
	// n! = n * (n -1)!
	
	public static void main(String[] args) {
		int num = 5;
		int factorial = recursiveFactorial(num);
		System.out.println("Factorial de " + num + " este: " + factorial);

	}

	public static int recursiveFactorial(int num) {
		if (num== 0) {
			return 1;
		}
		return num * recursiveFactorial(num - 1);
	}
	
}
