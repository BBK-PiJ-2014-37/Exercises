package day14;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSorter {
	public static List<Integer> sort (List<Integer> list) {
		int high = list.size();
		if (high < 2) return list;
		return merge(sort(list.subList(0, high/2)), sort(list.subList(high/2, high)));
	}

	public static List<Integer> merge(List<Integer> firstList, List<Integer> lastList) {
		if (firstList.isEmpty()) {
			return lastList;
		}
		if(lastList.isEmpty()) {
			return firstList;
		}
		List<Integer> sortedList = new ArrayList<Integer>();
		if (firstList.get(0) < lastList.get(0)) {
			sortedList.add(firstList.get(0));
			sortedList.addAll(merge(firstList.subList(1, firstList.size()), lastList));
		} else {
			sortedList.add(lastList.get(0));
			sortedList.addAll(merge(firstList, lastList.subList(1, lastList.size())));
		}
		return sortedList;
	}

	public static void main (String[] args) {
		List<Integer> list = Arrays.asList( 9, 10, 13, 14, 1, 3, 5, 6, 8,16, 23, 25, 45, 56, 67, 78, 89, 27, 28, 29, 30, 34 );
		System.out.println(sort(list).toString());
	}
}
