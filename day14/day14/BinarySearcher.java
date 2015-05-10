package day14;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearcher {
	
	public static boolean search(List<Integer> list, int n) {
		if (list.isEmpty()) return false;
		if(list.size() == 1) return (n == list.get(0));
		int listHalf = list.get(list.size() / 2);
		if (listHalf == n) {
			return true;
		} else if (listHalf > n) {
			return search(list.subList(0, list.size()/2), n);
		}
		return search (list.subList(list.size()/2, list.size()), n);
	}

	public static boolean otherSearchAux(List<Integer> list, int low, int high, int n) {
		if (high < low) return false;
		int mid = (low+high)/2;
		int midVal = list.get(mid);
		if (midVal == n) {
			return true;
		}
		if (midVal > n) {
			return otherSearchAux(list, low, mid-1, n);
		}
		return otherSearchAux(list, mid+1, high, n);
	}

	public static boolean otherSearch(List<Integer> list, int n) {
		return otherSearchAux(list, 0, list.size()-1, n);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 8, 9, 10, 13, 14, 16, 23, 25, 27, 28, 29, 30, 34, 45, 56, 67, 78, 89);
		for (Integer i: new Integer[] {34, 89, 1, -5, 15, 112}) {
			System.out.println("search:      " + i + " is" + (search(list, i) ? "" : " not") + " in the list.");			
			System.out.println("otherSearch: " + i + " is" + (otherSearch(list, i) ? "" : " not") + " in the list.");			
		}
	}
}
