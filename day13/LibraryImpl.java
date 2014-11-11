import java.util.Hashtable;

class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private int nextID;
	private Hashtable<String, Integer> userIDs;

	public LibraryImpl(String libraryName) {
		this.name = libraryName;
		this.maxBooksPerUser = 0;
		this.nextID = 1;
		this.userIDs = new Hashtable<String, Integer>();
	}
	
	public String getName() {
		return this.name;
	}

	public int getID(String userName) {
		if (!userIDs.containsKey(userName)) {
			userIDs.put(userName, nextID);
			nextID++;
		}
		return userIDs.get(userName);
	}
	
	public void setMaxBooksPerUser(int limit) {
		this.maxBooksPerUser = limit;
	}

	public int getMaxBooksPerUser(){
		return this.maxBooksPerUser;
	}

	public void addBook(String title, String author){
	}
	
	public Book takeBook(String title){
		return null;
	}

	public void returnBook(Book book){
	}
}