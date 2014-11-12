public interface Library {
	String getName();
	int getID(String userName);
	public void setMaxBooksPerUser(int limit);
	public int getMaxBooksPerUser();
	public void addBook(String title, String author);
	public Book takeBook(String title, String borrower);
	public void returnBook(Book book);
	public int getReaderCount();
	public int getBookCount();
	public int getBookBorrowedCount();
}