package merge_sort;

//		not an in-place algorithm
//		O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase
//		stable algorithm
		
		
public class Merge_sor {

//	merge sort:
//		1. divide and conquer algorithm
//		2. recursive algorithm
//		3. two phases: splitting and merging
//		4. splitting phase leads to fster sorting during the merging phase
//		5. splitting is logical. We don't create new arrays
	
	
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		mergeSort(intArray, 0, intArray.length);
		
		
		// print sorted array
	    for (int i = 0; i < intArray.length; i++) {
	        System.out.println(intArray[i]);
	    }
	}
	
	public static void mergeSort(int [] input, int start, int end) {
		
		// this if checks if the temporarly array has length = 1
		if (end - start < 2) {
			return;
		}
		
		// next step: partition of array
		int mid = (start + end) / 2;
		mergeSort(input, start, mid);			// split in left array
		mergeSort(input, mid, end);				// split in right array
		
		// after the array has been divided in arrays of size = 1 
		//(this means that the array is sorted - array with one element = sorted array),
		// merge the array backwords
		merge(input, start, mid, end);					
	}
	
	public static void merge(int [] input, int start, int mid, int end) {
		
		// optimisation: if the first element from the right partition is greater than the last element from the left partition
		// that means that the arrays are sorted and are in the the right position 
		if (input[mid - 1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		// create temporarlly array
		int[] temp = new int[end -start];
		
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		// copy the remaining elements
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
}
