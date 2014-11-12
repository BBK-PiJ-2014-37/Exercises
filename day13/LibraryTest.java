import org.junit.*;
import static org.junit.Assert.*;

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
		testLibrary.setMaxBooksPerUser(3);
		assertEquals(3, testLibrary.getMaxBooksPerUser());
	}

	@Test
	public void testInitialMaxBooksPerUser() {
		assertEquals(0, testLibrary.getMaxBooksPerUser());
	}

	@Test
	public void testAddTakeBook(){
		testLibrary.addBook(testTitle1, testAuthor1);
		testLibrary.addBook(testTitle2, testAuthor2);
		testLibrary.addBook(testTitle3, testAuthor3);
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
	}
	
	@Test
	public void testReturnBook(){
		testLibrary.addBook(testTitle1, testAuthor1);
		Book testBook = testLibrary.takeBook(testTitle1, testUser2);
		assertNotNull(testBook);
		testLibrary.returnBook(testBook);
		assertFalse(testBook.isTaken());
	}

}