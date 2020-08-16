package binary_search_trees;

public class Binary_search_trees {

	public static void main(String[] args) {
		
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(37);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
		
		intTree.traverseInOrder();
		System.out.println();
		
		intTree.traversePreOrder();
		System.out.println();
		
		System.out.println(intTree.get(37));
		System.out.println(intTree.get(26));
		System.out.println(intTree.get(8888));
		
		System.out.println("min value: " + intTree.min());
	    System.out.println("max value: " + intTree.max());
	    
	    
	    System.out.println("\n\tDelete 15, 37 and 25,then try to delete a value that doesn't exist, 8888 ");
	    intTree.delete(15);
	    intTree.traverseInOrder();
		System.out.println();
		
		intTree.delete(37);
	    intTree.traverseInOrder();
		System.out.println();
		
		intTree.delete(25);
	    intTree.traverseInOrder();
		System.out.println();
		
		intTree.delete(8888);
	    intTree.traverseInOrder();
		System.out.println();

	}

}
