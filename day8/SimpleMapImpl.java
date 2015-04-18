import java.util.ArrayList;

public class SimpleMapImpl implements SimpleMap {
	private ArrayList<Entry> entries;

	
	public SimpleMapImpl() {
		this.entries = new ArrayList<>();
	}

	public void put (int key, String name) {
		for(Entry entry : entries) {
			if (entry.key.equals(key)) {
				return;
			}
		}
		SimpleMapImpl.Entry newEntry = new SimpleMapImpl.Entry (key, name);
		entries.add(newEntry);
		
	}
		
	public String get (int key) {
		for(Entry entry : entries) {
			if (entry.key.equals(key)) {
			return entry.value;
			}
		}
		return null;
	}

	public void remove(int key) {
		for(int i = 0; i < entries.size(); i++) {
			if (entries.get(i).key == key) {
				entries.remove(i);
				return;
			}
		}
	}

	public boolean isEmpty() {
		return entries.isEmpty();
	}

	class Entry {
		Integer key;
		String value;

		public Entry (Integer key, String value) {
			this.key = key;
			this.value = value;
		}

	
	}

	public void prettyPrint() {
		for (Entry entry: entries) {
			System.out.println("" + entry.key + ": " + entry.value);
		}
	}
	

	public static void main (String[] args) {
		SimpleMapImpl employees = new SimpleMapImpl();
		if(employees.isEmpty()) {
			System.out.println("The map of employees is empty");
		}
		employees.put(1, "John");
		employees.put(2, "Mary");
		employees.put(3, "Joseph");
		employees.put(4, "Caroll");
		employees.put(5, "Julia");
		employees.prettyPrint();
		employees.remove(2);
		employees.prettyPrint();
		if(!employees.isEmpty()) {
			System.out.println("The map of employees is not empty anymore");
		}
		System.out.println("Employee's name with key 4 is: " + employees.get(4));
	}
}
