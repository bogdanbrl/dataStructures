package linear_search_algorithm;

public class Linear_search_algorithm {

	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println(linearSearch(intArray, -15));
		System.out.println(linearSearch(intArray, 99));
	}

	private static String linearSearch(int [] input, int value) {
		int i = 0;
		while(i < input.length) {
			if(input[i] == value) {
				return "Position: "+String.valueOf(i);
			}
			i++;
		}
		return "Not found";
	}

}
