import java.util.ArrayList;

public class MultiMapImpl implements MultiMap {

	class Bucket extends ArrayList<Entry> {
	}

	private Bucket[] buckets;
	private int entryCount;

	
	public MultiMapImpl() {
		this.buckets = new Bucket[HashUtilities.MAX_HASH];
		this.entryCount = 0;
	}

	public void put (int key, String name) {
		int hash = HashUtilities.shortHash(key);
		if (buckets[hash] == null) {
			Bucket entryList = new Bucket();
			Entry entry = new Entry(key);
			entry.add(name);
			entryList.add(entry);
			buckets[hash] = entryList;
			entryCount++;
			return;
		}
		for(Entry entry : buckets[hash]) {
			if (entry.key == key) {
				entry.add(name);
				return;
			}
		}
		Entry entry = new Entry(key);
		entryCount++;
		entry.add(name);
		buckets[hash].add(entry);
	}

		
	public String[] get (int key) {
		int hash = HashUtilities.shortHash(key);
		Bucket bucket = buckets[hash];
		for(Entry entry : bucket) {
			if (entry.key == key) {
			return entry.values.toArray(new String[entry.values.size()]);
			}
		}
		return null;
	}

	public void remove(int key, String value) {
		int hash = HashUtilities.shortHash(key);
		Bucket entryList = buckets[hash];
		if (entryList == null) {
			return;
		}
		for (int i = 0; i < entryList.size(); i++) {
			if (entryList.get(i).key == key) {
				entryList.get(i).remove(value);
				if (entryList.get(i).isEmpty()) {
					entryList.remove(i);
					entryCount--;
				}
			}		
		}
	}
		

	public boolean isEmpty() {
		return entryCount == 0;
	}

	class Entry {
		ArrayList<String> values;
		int key;

		public Entry(int key) {
			this.values = new ArrayList<String>();
			this.key = key;
		}

		public void add(String value) {
			if (findValue(value) >= 0) {
				return;
			}
			values.add(value);
		}

		public void remove(String value) {
			int index = findValue(value);
			if(index >= 0) {
				values.remove(index);
			}
		}

		public boolean isEmpty() {
			return values.isEmpty();
		}

		private int findValue(String v) {
			for (int i = 0; i < values.size(); i++) {
				if (values.get(i).equals(v)) {
					return i;
				}
			}
			return -1;
		}
	}

	public void prettyPrint() {
		for (ArrayList<Entry> entryList: buckets) {
			if (entryList != null) {
				for (Entry entry : entryList) {
					System.out.println("" + entry.key + " : " + entry.values.toString());
				}
			}
		}
	}
	

	public static void main (String[] args) {
		MultiMapImpl employees = new MultiMapImpl();
		if(employees.isEmpty()) {
			System.out.println("The map of employees is empty");
		}
		
		employees.put(1, "John");
		employees.put(2, "Mary");
		employees.put(3, "Joseph");
		employees.put(4, "Caroll");
		employees.put(4, "Carola");
		employees.put(5, "Julia");
		employees.prettyPrint();
		employees.remove(4, "Carola");
		employees.prettyPrint();
		if(!employees.isEmpty()) {
			System.out.println("The map of employees is not empty anymore");
		}
		
		System.out.println("Employees' names with key 4 are: " + employees.get(4));
	}
}
