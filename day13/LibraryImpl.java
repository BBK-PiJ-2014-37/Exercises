import java.util.Hashtable;

class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private int nextID;
	private Hashtable<String, Integer> userIDs;
	private Hashtable<String, Book> books;

	public LibraryImpl(String libraryName) {
		this.name = libraryName;
		this.maxBooksPerUser = 0;
		this.nextID = 1;
		this.userIDs = new Hashtable<String, Integer>();
		this.books = new Hashtable<String, Book>();
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
		Book newBook = new BookImpl(title, author);
		books.put(title, newBook);
	}
	
	public Book takeBook(String title, String borrower){
		if (!books.containsKey(title)) {
			return null;
		}
		Book aBook = books.get(title);
		if (aBook.isTaken()) {
			return null;
		}
		aBook.setBorrower(borrower);
		return aBook;
	}

	public void returnBook(Book book){
		book.setBorrower(null);
	}
}