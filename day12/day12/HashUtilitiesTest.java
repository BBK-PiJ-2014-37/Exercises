package day12;
import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
	@Test
	public void HashTest() {
		int i = 0;
		while(i < 2000) {
			Integer randomNum = (int)(2*(Math.random() - 0.5)*Integer.MAX_VALUE); 
			int hash = randomNum.hashCode();
			int smallHash = HashUtilities2.shortHash(hash);
			i++;
			assertTrue(smallHash >= 0 && smallHash < 1000);
		}

	}
}