public class Comparator {
	
	public double getMax(double n1, double n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

	public int getMax(int n1, int n2) {
		return (int)getMax((double)n1, (double)n2);
	}

	public String getMax(String s1, String s2) {
		Integer n1 = Integer.parseInt(s1);
		Integer n2 = Integer.parseInt(s2);
		return "" + getMax(n1, n2);
	}

}