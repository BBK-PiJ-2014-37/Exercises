public interface MultiMap {
	
	void put (int key, String name) ;
	String[] get (int key);
	void remove(int key, String name);
	boolean isEmpty();
}