import java.util.LinkedList;

public class ListInSet {
	private LinkedList<Integer> list;

	public ListInSet() {
		list = new LinkedList<Integer>();
	}
	//adds a new int to the set: if it is there already, nothing happens
	public void add (int value){
		if (!list.contains(value)) {
			list.add(value);
		}		
	}
	//returns true if the number is inthe set, false otherwise
	public boolean contains(int value){
		return list.contains(value);
	}
	//return the same values as the former method; but for every element prints its value in the screen
	public boolean containsVerbose(int value){
		if (list.contains(value)) {
			System.out.println(value);
			return true;
		}
		return false;
	}

	// returns a String with the values of the elements in the set, separated by commas.
	public String toString() {
		return list.toString();
	}

	public static void main (String[] args) {
		ListInSet list = new ListInSet();
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