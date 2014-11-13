import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

class MockLibrary implements Library {
	
	public String getName() {
		return "Library Name";
	}

	public int getID(String userName) {
		return 13;
	}
	
	public void setMaxBooksPerUser(int limit) {
	}

	public int getMaxBooksPerUser(){
		return 2;
	}

	public void addBook(String title, String author) {
	}

	public Book takeBook(String title, String borrower){
		return null;
	}

	public void returnBook(Book book){
	}
	
	public int getReaderCount() {
		return 0;
	}

	public int getBookCount() {
		return 0;
	}
	
	public int getBookBorrowedCount() {
		return 0;
	}

	public List<Book> getBooksBorrowedBy(String userName) {
		List<Book> list = new ArrayList<Book>();
		list.add(new BookImpl("BookTitle", "BookAuthor"));
		return list;
	}

}

public class UserTest {
 	static String testUserName = "Tim Burton";
 	User testUser;

 	@Before
 	public void setUp() {
 		String testName = testUserName;
		testUser = new UserImpl(testUserName);
 	}

	@Test
	public void testGetName() {
		assertEquals(testUserName, testUser.getName());
	}

	@Test
	public void testInitialID() {
		assertEquals(0, testUser.getID());
	}

	@Test
	public void testSetGetID() {
		int testID = 42;
		testUser.setID(testID);
		assertEquals(testID, testUser.getID());
	}

	@Test
	public void testRegister() {
		Library testLibrary = new MockLibrary();
		testUser.register(testLibrary);
		assertSame(testLibrary, testUser.getLibrary());
		assertEquals(13, testUser.getID());
	}

	@Test
	public void testBooksBorrowed() {
		UserImpl user = new UserImpl("UserName");
		MockLibrary library = new MockLibrary();
		user.register(library);
		List<Book> list = user.getBooksBorrowed();
		assertEquals(1, list.size());
		assertEquals("BookTitle", list.get(0).getTitle());
		assertEquals("BookAuthor", list.get(0).getAuthor());
	}
}