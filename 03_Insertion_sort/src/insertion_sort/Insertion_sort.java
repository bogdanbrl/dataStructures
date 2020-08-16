package insertion_sort;

public class Insertion_sort {

	// this is an stable algorithm
	// time complexity O(n^2)
	
	public static void main(String[] args) {
		
		 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	     // shift elements
		 for(int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++) {
			 int newElement = intArray[firstUnsortedIndex];
			 
			 int i;
			 
			 for(i=firstUnsortedIndex; i>0 && intArray[i-1]>newElement; i--) {
				 intArray[i] = intArray[i-1];
			 }
			 
			 intArray[i] = newElement;
		 }
		 
		 
		 

	        for (int i = 0; i < intArray.length; i++) {
	            System.out.println(intArray[i]);
	        }

	}

}
