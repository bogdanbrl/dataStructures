package linear_probing;

// key and hash are always different
// key can be of any type, hash is always an integer

public class SimpleHashtable {
	private StoredEmployee[] hashtable;

	public SimpleHashtable() {
		hashtable = new StoredEmployee[10];
	}

	public void put(String key, Employee employee) {
		// hash the key - will give us the position in the array
		int hashedKey = hashKey(key);
		// check if hashKey is occupied. If true, do linear probing
		if (occupied(hashedKey)) {
			// set the start index (where do you want to start looking for an empty array -
			// index), in this case we set the hashkey that is occupied
			int stopIndex = hashedKey;
			if (hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}

			while (occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}

		}

		if (occupied(hashedKey)) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);
		}
	}

	public Employee get(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		return hashtable[hashedKey].employee;
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			return hashedKey;
		}

		int stopIndex = hashedKey;
		if (hashedKey == hashtable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}

		while (hashedKey != stopIndex && 
				hashtable[hashedKey] != null &&
				!hashtable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}
		
		if(stopIndex == hashedKey) {
			return -1;
		}else {
			return hashedKey;
		}

	}

	private boolean occupied(int index) {
		return hashtable[index] != null;
	}

	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if(hashtable[i] == null) {
				System.out.println("empty");
			}else {
				System.out.println("Position " + i + ": " + hashtable[i].employee);
			}
		}
	}
}
