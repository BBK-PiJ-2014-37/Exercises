package day13;
import java.util.List;

public interface User {
	String getName();
	int getID();
	void setID(int idNumber);
	void register(Library library);
	Library getLibrary();
	List<Book> getBooksBorrowed();
}