import org.junit.*;
import static org.junit.Assert.*;

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
}