import org.junit.*;
import static org.junit.Assert.*;

 public class BookTest {

	@Test
	public void testGetTitle() {
		Book testBook = new BookImpl("Alice in Wonderland", "Lewis Carroll");
		assertSame(testBook.getTitle(), "Alice in Wonderland");
	}

	@Test
	public void testGetAuthor() {
		Book testBook = new BookImpl("Alice in Wonderland", "Lewis Carroll");
		assertSame(testBook.getAuthor(), "Lewis Carroll");
	}

}
