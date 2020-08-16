package stack_challenge;

import java.util.LinkedList;

//using a stack, determine whether a string is a palindrome

public class Main {

	public static void main(String[] args) {
		System.out.println(checkForPalindrome("abccba"));
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		System.out.println(checkForPalindrome("I did, did I?"));
		System.out.println(checkForPalindrome("hello"));
		System.out.println(checkForPalindrome("Don't nod"));

	}

	
	public static boolean checkForPalindrome(String string) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
		StringBuilder stringNotPunctuation = new StringBuilder(string.length());
		String lowerCase = string.toLowerCase();
		
		for(int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if(c >= 'a' && c <= 'z') {
				stringNotPunctuation.append(c);
				stack.push(c);
			}
		}
		
		StringBuilder reversedString = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		
		return reversedString.toString().equals(stringNotPunctuation.toString());
	}
}
