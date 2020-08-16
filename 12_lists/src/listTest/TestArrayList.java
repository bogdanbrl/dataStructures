package listTest;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3); list.add(12); list.add(26);
		
		list.forEach(Integer -> System.out.println(Integer));
		System.out.println("========================");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(8); list2.add(3); list2.add(6); list2.add(9);
		
		list.addAll(list2);
		list.forEach(Integer -> System.out.print(Integer + " "));
		
		

	}

}
