package quick_sort;

//	in-place algorithm

//	O(nlogn) - base 2.
//	We're repeatedly partinioning thearray into two halves
//	unstable algorithm

public class Quick_sort {

//	divede and conquer algorithm
//	recursive algorithm
//	 uses a pivot leement to partition the array into two parts
//	 elements < pivot to its left, elements > pivot to its right
//	 pivot will then be in its correct sorted position

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		quickSort(intArray, 0, intArray.length);
				
		// print sorted array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void quickSort(int [] input, int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}
	
	public static int partition(int []input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		
		//check if i and j cross each others
		while (i < j ) {
			// NOTE: empty loop body
			while(i < j && input[--j] >= pivot);
			if(i < j) {
				input[i] = input[j];
			}
			
			// NOTE: empty loop body
			while (i < j && input[++i] <= pivot);
			if(i < j) {
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		return j;
	}

}
