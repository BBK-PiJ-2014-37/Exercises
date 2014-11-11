public class BookImpl implements Book {
	private String title;
	private String author;
	
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public boolean isTaken() {
		return true;
	}
}