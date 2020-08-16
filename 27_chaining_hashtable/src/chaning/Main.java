package chaning;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		ChainingHashtable ht = new ChainingHashtable();
		ht.put("Janes", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);
		
		ht.printHashtable();
		
		System.out.println("\n\n\n\nRetrive key Wilson: " + ht.get("Wilson"));
		System.out.println("\n\n\n\nRetrive key Smith: " + ht.get("Smith"));
		
		ht.remove("Smith");
		ht.printHashtable();
		
	}

}
