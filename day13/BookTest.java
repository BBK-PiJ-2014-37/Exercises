import org.junit.*;
import static org.junit.Assert.*;

 public class BookTest {
 	static String testTitle = "Alice in Wonderland";
 	static String testAuthor = "Lewis Carroll";
 	Book testBook;
 	static String testBorrower = "Tim Burton";
 	

 	@Before
 	public void setUp() {
 		testBook = new BookImpl(testTitle, testAuthor);
 	}

	@Test
	public void testGetTitle() {
		assertSame(testBook.getTitle(), "Alice in Wonderland");
	}

	@Test
	public void testGetAuthor() {
		assertSame(testBook.getAuthor(), "Lewis Carroll");
	}

	@Test
	public void  testIsTakenSetGetBorrower() {
		assertFalse(testBook.isTaken());
		testBook.setBorrower(testBorrower);
		assertTrue(testBook.isTaken());
		assertSame(testBook.getBorrower(), "Tim Burton");
	}
}
