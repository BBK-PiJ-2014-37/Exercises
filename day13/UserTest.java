import org.junit.*;
import static org.junit.Assert.*;

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
}