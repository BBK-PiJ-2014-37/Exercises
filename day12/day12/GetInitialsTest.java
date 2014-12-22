package day12;
import org.junit.*;
import static org.junit.Assert.*;

	
public class GetInitialsTest {

	@Test
	public void getInitialsTest(){
		GetInitials initialGetter = new GetInitials();		
		String name1 = "Dereck Robert Yssirt";
		String expected1 = "DRY";
		assertEquals(expected1, initialGetter.getInitials(name1));
/*		String name2 = "Dereck  Robert Yssirt ";
		String expected2 = "DRY";
		testInitials(expected2, nam2, msg);
		String name3 = "MONNA   LISSA";
		String expected3 = "ML";
		testInitials(expected3, name3, msg);
		String name4 = "  Dereck Robert  Yssirt";
		String expected4 = "DRY";
		testInitials(expected4, name4, msg);
		String name5 = "";
		String expected5 = "";
		testInitials(expected5, name5, msg);
*/	}

}