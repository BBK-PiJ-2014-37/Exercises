import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class LibraryTest {
	static String testLibraryName = "British Library";
 	Library testLibrary;
 	static String testTitle1 = "Alice in Wonderland";
 	static String testAuthor1 = "Lewis Carroll";
 	static String testTitle2 = "Rayuela";
 	static String testAuthor2 = "Julio Cortazar";
	static String testTitle3 = "19Q4";
 	static String testAuthor3 = "Haruki Murakami";
 	static String testUser1 = "Tim Burton";
 	static String testUser2 = "Amelia Baltar";

 	@Before
 	public void setUp() {
 		testLibrary = new LibraryImpl(testLibraryName);
 		testLibrary.setMaxBooksPerUser(3);
 	}

	@Test
	public void  testGetName() {
		assertEquals(testLibraryName, testLibrary.getName());
	}

	@Test
	public void testConsecutiveGetIDs() {
		assertEquals(testLibrary.getID("a"), 1);
		assertEquals(testLibrary.getID("b"), 2);
		assertEquals(testLibrary.getID("c"), 3);
	}

	@Test
	public void testRepeatedGetIDs() {
		assertEquals(testLibrary.getID("a"), 1);
		assertEquals(testLibrary.getID("b"), 2);
		assertEquals(testLibrary.getID("a"), 1);
		assertEquals(testLibrary.getID("b"), 2);
	}

	@Test
	public void testSetGetMaxBooksPerUser() {
		testLibrary.setMaxBooksPerUser(4);
		assertEquals(4, testLibrary.getMaxBooksPerUser());
	}

	@Test
	public void testDoesntLendBooksToUnregisteredPeople() {
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.getID(testUser1);
		Book testBook = testLibrary.takeBook(testTitle1, testUser2);
		assertNull(testBook);
	}

	@Test 
	public void testDoesntLendNonExistingBooks () {
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.getID(testUser1);
		Book testBook = testLibrary.takeBook(testTitle2, testUser1);
		assertNull(testBook);
	}

	@Test 
	public void testDoesntLendTooManyBooks () {
		testLibrary.setMaxBooksPerUser(2);
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.addBook(testTitle2, testAuthor2);
		testLibrary.addBook(testTitle3, testAuthor3);
		testLibrary.getID(testUser1);
		Book book1 = testLibrary.takeBook(testTitle1, testUser1);
		Book book2 = testLibrary.takeBook(testTitle2, testUser1);
		Book book3 = testLibrary.takeBook(testTitle3, testUser1);
		assertNotNull(book1);
		assertNotNull(book2);
		assertNull(book3);
		testLibrary.returnBook(book1);
		book3 = testLibrary.takeBook(testTitle3, testUser1);
		assertNotNull(book3);
	}

	@Test
	public void testAddTakeBook(){
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.addBook(testTitle2, testAuthor2);
		testLibrary.addBook(testTitle3, testAuthor3);
		testLibrary.getID(testUser1);
		testLibrary.getID(testUser2);
		Book testBook = testLibrary.takeBook(testTitle1, testUser1);
		assertNotNull(testBook);
		assertEquals(testTitle1, testBook.getTitle());
		assertEquals(testAuthor1, testBook.getAuthor());
		assertTrue(testBook.isTaken());
		assertNull(testLibrary.takeBook(testTitle1, testUser2));
		testBook = testLibrary.takeBook(testTitle2, testUser1);
		assertNotNull(testBook);
		assertEquals(testTitle2, testBook.getTitle());
		assertEquals(testAuthor2, testBook.getAuthor());
		assertTrue(testBook.isTaken());
		assertNull(testLibrary.takeBook(testTitle2, testUser1));
		testBook = testLibrary.takeBook(testTitle3, testUser2);
		assertNotNull(testBook);
		assertEquals(testTitle3, testBook.getTitle());
		assertEquals(testAuthor3, testBook.getAuthor());
		assertTrue(testBook.isTaken());
		assertNull(testLibrary.takeBook(testTitle3, testUser1));
		assertNull(testLibrary.takeBook("Rubbish", testUser2));
		List<Book> books = testLibrary.getBooksBorrowedBy(testUser1);
		assertEquals(2, books.size());
		books = testLibrary.getBooksBorrowedBy(testUser2);
		assertEquals(1, books.size());
	}

	
	@Test
	public void testReturnBook(){
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.getID(testUser2);
		Book testBook = testLibrary.takeBook(testTitle1, testUser2);
		assertNotNull(testBook);
		testLibrary.returnBook(testBook);
		assertFalse(testBook.isTaken());
	}

	@Test
	public void testGetReaderCount() {
		assertEquals(0, testLibrary.getReaderCount());
		testLibrary.getID(testUser1);
		testLibrary.getID(testUser2);
		assertEquals(2, testLibrary.getReaderCount());
	}
	
	@Test
	public void testGetBookCount() {
		assertEquals(0, testLibrary.getBookCount());
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.addBook(testTitle2, testAuthor2);
		assertEquals(2, testLibrary.getBookCount());
		testLibrary.addBook(testTitle3, testAuthor3);
		assertEquals(3, testLibrary.getBookCount());
	}

	@Test
	public void testGetBookBorrowedCount() {
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.addBook(testTitle2, testAuthor2);
		testLibrary.addBook(testTitle3, testAuthor3);
		assertEquals(0, testLibrary.getBookBorrowedCount());
		testLibrary.getID(testUser1);
		Book testBook = testLibrary.takeBook(testTitle1, testUser1);
		assertNotNull(testBook);
		assertEquals(1, testLibrary.getBookBorrowedCount());
		testLibrary.returnBook(testBook);
		assertEquals(0, testLibrary.getBookBorrowedCount());
	}
}