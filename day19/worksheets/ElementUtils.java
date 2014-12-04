package worksheets;

import java.util.ArrayList;
import java.util.List;

public class ElementUtils {
	// Uninstantiatable class
	private ElementUtils() {
	}

	public static <T> T betterElement(T element1, T element2,
			TwoElementPredicate<T> tester) {
		if (tester.isBetter(element1, element2)) {
			return (element1);
		} else {
			return (element2);
		}
	}
    public static <T> List<T> allMatches(List<T> list, Predicate<T> p) {
    	List<T> newList = new ArrayList<T>();
    	for (int i = 0; i < list.size(); i++) {
    		if (p.matches(list.get(i))) {
    			newList.add(list.get(i));	 			
    		} 
    	}
    	return newList;
    }

}
