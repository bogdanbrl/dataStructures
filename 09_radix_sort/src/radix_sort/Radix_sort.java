package radix_sort;

//	makes assumptions about the data it is sorting
//	data must have same radix and witdth
//	beacause of this, data must be integers or strings
//	sort based on each individual digit or letter position
//	start at the rightmost position
//	must use a stable sort algorithm at each stage
	
// float number can't be sorted using radix sort

public class Radix_sort {

//	counting sort is often used as the sort algorithm for radix sort - must be stable counting sort
//	O(n) - can achive this because we're making assumptions about the data we're sorting
//	even so, it often runs slower than O(nlogn) algorithms because of the overhead involved
//	in-place depends on which sort algorithm tou use 
//	stable algorithm
	
	public static void main(String[] args) {
		// all input are digital numbers and all have the witdt equal to 4 (same length)
		int[] intArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
		
		
		radixSort(intArray, 10, 4);
				
		// print sorted array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	// for implementation we need to make same steps to make it stable:
		// requires extra steps
		// can calculate where values should be written back to the original array
		// writing the values into the array in backwards order ensures stability
	
	public static void radixSort(int [] input, int radix, int width) {
		for(int i=0; i<width; i++) {
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for(int value: input) {
			countArray[getDigit(position, value, radix)]++;
		}
		// adjust the count array
		for(int j=1; j<radix; j++) {
			countArray[j] += countArray[j-1];
		}
		
		int[] temp = new int[numItems];
		for(int tempIndex = numItems -1; tempIndex >=0; tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		
		for(int tempIndex=0; tempIndex<numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
	}

	public static int getDigit(int position, int value,int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}
}
