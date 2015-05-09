package day15;
import java.util.LinkedList;
import java.util.List;

public class Hailstone {

	public List<Integer> getSequence(int n) {
		List<Integer> result;
		if (n == 1) {
			result = new LinkedList<Integer>();
			result.add(0, 1);
			return result;
		}
		if (n % 2 == 0){
			result = getSequence(n/2);
			result.add(0, n);
			return result;
		}
		result = getSequence(3 * n + 1);
		result.add(0, n);
		return result;
	}

	public static void main (String[] args) {
		Hailstone myHail = new Hailstone();
		System.out.println(myHail.getSequence(5).toString());
		
	}
}