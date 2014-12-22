package day15;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class PrimeDivisorListImplTest{
	
	@Test
	public void addTest() {
		PrimeDivisorList listTest = new PrimeDivisorListImpl();
		assertEquals("[1]", listTest.toString());
		listTest.add(new Integer(2));
		listTest.add(new Integer(3));
		listTest.add(new Integer(5));
		assertEquals("[2 * 3 * 5 = 30]", listTest.toString());
		listTest.add(new Integer(3));
		assertEquals("[2 * 3^2 * 5 = 90]", listTest.toString());
		listTest.remove(2);
		assertEquals("[3^2 * 5 = 45]", listTest.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void illegalArgumentExceptionTest() {
		PrimeDivisorList listTest = new PrimeDivisorListImpl();
		listTest.add(new Integer(4));
	} 

	@Test(expected=NullPointerException.class)
	public void nullPointerExceptionTest() {
		PrimeDivisorList listTest = new PrimeDivisorListImpl();
		listTest.add(null);
	}
}