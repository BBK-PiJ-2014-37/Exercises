package day13;
import java.util.List;


public class UserImpl implements User {

	private String name;
	private int userID;
	private Library library;
	
	public UserImpl(String name) {
		this.name = name;
		this.userID = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.userID;
	}
	
	public void setID(int idNumber) {
		this.userID = idNumber;
	}

	public void register(Library library) {
		this.setID(library.getID(this.getName()));
		this.library = library;
	}

	public Library getLibrary() {
		return this.library;
	}

	public List<Book> getBooksBorrowed() {
		return this.getLibrary().getBooksBorrowedBy(this.getName());
	}
}