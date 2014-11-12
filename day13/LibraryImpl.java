import java.util.Hashtable;
import java.util.Enumeration;

class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private int nextID;
	private Hashtable<String, Integer> userIDs;
	private Hashtable<String, Integer> booksBorrowed;
	private Hashtable<String, Book> books;

	public LibraryImpl(String libraryName) {
		this.name = libraryName;
		this.maxBooksPerUser = 0;
		this.nextID = 1;
		this.userIDs = new Hashtable<String, Integer>();
		this.booksBorrowed = new Hashtable<String, Integer>();
		this.books = new Hashtable<String, Book>();
	}
	
	public String getName() {
		return this.name;
	}

	public int getID(String userName) {
		if (!userIDs.containsKey(userName)) {
			userIDs.put(userName, nextID);
			nextID++;
			booksBorrowed.put(userName, 0);
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
		if (!(books.containsKey(title) && userIDs.containsKey(borrower))) {
			return null;
		}
		Book aBook = books.get(title);
		if (aBook.isTaken() || (booksBorrowed.get(borrower) >= this.getMaxBooksPerUser())) {
			return null;
		}
		aBook.setBorrower(borrower);
		booksBorrowed.put(borrower, booksBorrowed.get(borrower) + 1);
		return aBook;
	}

	public void returnBook(Book book) {
		if (!book.isTaken() || !userIDs.containsKey(book.getBorrower())) {
			return;
		}
		String borrower = book.getBorrower();
		booksBorrowed.put(borrower, booksBorrowed.get(borrower) - 1);
		book.setBorrower(null);
	}

	public int getReaderCount() {
		return userIDs.size();

	}

	public int getBookCount() {
		return books.size();
	}

	public int getBookBorrowedCount() {
		int booksBorrowed = 0;
		for (Enumeration<Book> e = books.elements(); e.hasMoreElements();) {
			Book thisBook = e.nextElement();
			if (thisBook.isTaken()) {
				booksBorrowed++;
			}
		}
		return booksBorrowed;
	}
}