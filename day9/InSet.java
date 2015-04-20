public interface InSet {
	//adds a new int to the set: if it is there already, nothing happens
	void add (int value);
	//returns true if the number is inthe set, false otherwise
	boolean contains(int value);
	//return the same values as the former method; but for every element prints its value in the screen
	boolean containsVerbose(int value);
	// returns a String with the values of the elements in the set, separated by commas.
	String toString();

}