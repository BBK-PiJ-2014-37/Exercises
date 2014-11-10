import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	static String testLibraryName = "British Library";
 	Library testLibrary;

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
}