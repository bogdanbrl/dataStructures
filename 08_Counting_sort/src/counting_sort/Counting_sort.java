package counting_sort;

//	makes assumptions about the data
//	doesn't use comparisons
//	counts th enumber of occurrences of each value
//	only woks with non-negative discrete values (can't work with floats, strings)
//	values must be within a specific range

//	this sort method can achived linear time

public class Counting_sort {

	// not an in-place algorithm
	// O(n) - can achieve this because we're making assumptions about the data we're soting
	// if we want the sort to be stable, we have to do some extra steps
	
	public static void main(String[] args) {
		int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

	
		countingSort(intArray, 1, 10);
		
				
		// print sorted array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int [(max - min) +1]; 
		
		for(int i=0; i<input.length; i++) {
			countArray[input[i] - min]++;
		}
		
		int j = 0;
		for(int i=min; i<=max; i++) {
			while(countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
		
	}

}
