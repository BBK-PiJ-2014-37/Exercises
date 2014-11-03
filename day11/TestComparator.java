public class TestComparator {
	public static void main  (String[] args) {
		Integer n1 = 8;
		Integer n2 = 6;
		Double d1 = 9.567;
		Double d2 = 5.887;
		String s1 = "98";
		String s2 = "67";
		Comparator myComparator = new Comparator();
		System.out.println(myComparator.getMax(n1,n2));
		System.out.println(myComparator.getMax(d1,d2));
		System.out.println(myComparator.getMax(s1,s2));
	}
}