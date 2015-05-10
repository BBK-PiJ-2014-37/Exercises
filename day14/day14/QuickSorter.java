package day14;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSorter {
	public static List<Integer> sort(List<Integer> list) {
		if (list.size() < 2) return list;
		int pivot = list.get(0);
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		for (int i = 1; i < list.size(); i++) {
			if (pivot > list.get(i)) {
				first.add(list.get(i));
			} else {
				last.add(list.get(i));
			}
		}
		List <Integer> result = sort(first);
		result.add(pivot);
		result.addAll(sort(last));
		return result; 
	}

	public static void main (String[] args) {
		List<Integer> list = Arrays.asList( 9, 10, 13, 14, 1, 3, 5, 6, 8,16, 23, 25, 45, 56, 67, 78, 89, 27, 28, 29, 30, 34 );
		System.out.println(sort(list).toString());
	}
}
