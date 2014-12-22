package day13;
public class BookImpl implements Book {
	private String title;
	private String author;
	private String borrower;
	
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
		this.borrower = null;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public boolean isTaken() {
		return this.borrower != null;
	}

	public void setBorrower(String userName) {
		this.borrower = userName;
	}

	public String getBorrower() {
		return this.borrower;
	}
}