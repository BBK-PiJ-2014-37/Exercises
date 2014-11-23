import java.util.*;
import java.lang.Math;

public class PrimeDivisorListImpl implements PrimeDivisorList{
	Hashtable<Integer,Integer> map;

	public PrimeDivisorListImpl() {
		this.map = new Hashtable<Integer,Integer>();
	}
	
	
	public void add(Integer prime) {
		if (prime == null) {
			throw new NullPointerException("" + prime + " is null.");
		}
		if (!isPrime(prime)) {
			throw new IllegalArgumentException("" + prime + " is not prime.");
		}
		Integer exp = map.get(prime);
		if(exp != null) {
			map.put(prime, exp+1);
		} else {
			map.put(prime, new Integer(1));	
		}					
	}

	public void remove(Integer prime) {
		Integer exp = map.get(prime);
		if (exp.equals(null)) {
			return;
		}
		if(exp > 1) {
			map.put(prime, exp-1);
		} else {
			map.remove(prime);
		}				
	}

	static String numAndExpAsString(Integer num, Integer exp) {
		if (exp > 1) {
			return "" + num + "^" + exp;
		} else {
			return "" + num;
		}
	}

	@Override
	public String toString() {
		List<Integer> list = Collections.list(map.keys());
		Collections.sort(list);
		String result = "[";
		Integer num = null;
		Integer exp = null;
		Integer total = 1;
		if (list.size() == 0) {
			return "[1]";
		}
		for(int i=0; i < list.size()-1; i++) {
			num = list.get(i);
			exp = map.get(num);
			total *= new Integer((int)Math.pow((double)num, (double)exp));
			result += numAndExpAsString(num, exp) + " * ";
		}
		num = list.get(list.size()-1);
		exp = map.get(num);
		total *= new Integer((int)Math.pow((double)num, (double)exp));
		return result + numAndExpAsString(num, exp) + " = " + total + "]";
	}

	private static boolean isPrime(Integer candidate) {
		int divisor = (int)Math.sqrt(candidate);
		while (divisor > 1) {
			if (candidate % divisor == 0) {
				return false;
			} 
			divisor--;
		}
		return true;
	}
}