package hashtable_from_JDK;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		
		// use map interface and the hashMap will not be sorted and it will be printed in insertion order
		// Map<String, Employee> hashMap = new HashMap<String, Employee>();
		
		// Map<String, Employee> hashMap = new LinkedHashMap<String, Employee>();		// print in the same order as the insertions
		
		// SortedMap<String, Employee> hashMap = new TreeMap<String, Employee>();
		
		SortedMap hashMap = Collections.synchronizedSortedMap(new TreeMap<String, Employee>());
		
		
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		hashMap.put("Wilson", mikeWilson);
		hashMap.put("End", billEnd);
		
//		Iterator<Employee> itr = hashMap.values().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
			
//		for(Entry<String, Employee> m : hashMap.entrySet()) {
//			System.out.println(m.getKey()+ ": " + m.getValue());
//		}
				
		hashMap.forEach((k, v) -> System.out.println(k + ": " + v));
		
	}

}
