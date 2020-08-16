package shell_sort;

//difficult to naildown the time complexity beacause it will depend on the gap. 
//Worst case: O(n^2), but it can perform much better than that
//doesn't require as much shifting as insertion sort, so it usually performs btter

//unstable algoritm
public class Shell_sort {

	//gap is calculated using (3^k)/2
	//we set k based on the lenght of the array
	//we want the gap to be as close as possible to the lenght of the 
	//	array we want to sort, without being greater than the lenght
	//	so for k = 1, gap(interval) = 1
	//	so for k = 2, gap(interval) = 4
	//	so for k = 3, gap(interval) = 13
	//	so for k = 4, gap(interval) = 40
	//	so for k = 5, gap(interval) = 121
	
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	    for(int gap=intArray.length/2; gap>0; gap /= 2) {
	    	
	    	for(int i=gap; i<intArray.length; i++) {
	    		
	    		int newElement = intArray[i];	    		
	    		int j = i;
	    		
	    		while (j>=gap && intArray[j -gap] > newElement) {
	    			intArray[j] = intArray[j - gap];
					j -= gap;
					
					intArray[j] = newElement;									 
				}
	    	}
	    }
		 		 		 
		// print sorted array
	    for (int i = 0; i < intArray.length; i++) {
	        System.out.println(intArray[i]);
	    }
	    
	}

}
