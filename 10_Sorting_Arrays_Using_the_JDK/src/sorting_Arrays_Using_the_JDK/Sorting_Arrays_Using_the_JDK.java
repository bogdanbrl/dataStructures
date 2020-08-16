package sorting_Arrays_Using_the_JDK;

import java.util.Arrays;

public class Sorting_Arrays_Using_the_JDK {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	    Arrays.parallelSort(intArray);
		 		 		 
		// print sorted array
	    for (int i = 0; i < intArray.length; i++) {
	        System.out.println(intArray[i]);
	    }

	}

}
