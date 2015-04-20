public class TreeInSet implements InSet {
	private IntegerTreeNode first;

	//adds a new int to the set: if it is there already, nothing happens
	public void add (int value) {
		if(first == null) {
			first = new IntegerTreeNode(value);
		} else {
			first.add(value);
		}
	}

	//returns true if the number is inthe set, false otherwise
	public boolean contains(int value){
		return first != null && first.contains(value);
	}
	
	//return the same values as the former method; but for every element prints its value in the screen
	public boolean containsVerbose(int value) {
		return first != null && first.containsVerbose(value);
	}

	// returns a String with the values of the elements in the set, separated by commas.
	public String toString() {
		if (first == null) {
			return "";
		}
		return first.toString();
	}

	public static void main (String[] args) {
		TreeInSet list = new TreeInSet();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		if(list.contains(4)) {
			System.out.println("The list contains: 4");
		}
		list.containsVerbose(7);
		System.out.println(list.toString());
	}
}