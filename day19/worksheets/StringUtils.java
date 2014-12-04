package worksheets;

import java.util.*;

public class StringUtils {
    private StringUtils() {
    } // Uninstantiatable class

    public static int eChecker(String s1, String s2) {
        int compareFlag = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            compareFlag = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            compareFlag = 1;
        }
        return (compareFlag);
    }

    public static String betterString(String s1, String s2,
                                      TwoStringPredicate tester) {
        if (tester.isBetter(s1, s2)) {
            return (s1);
        } else {
            return (s2);
        }
    }
    public static List<String> allMatches(List<String> list, Predicate<String> p) {
    	List<String> newList = new ArrayList<String>();
    	for (int i = 0; i < list.size(); i++) {
    		if (p.matches(list.get(i))) {
    			newList.add(list.get(i));	 			
    		} 
    	}
    	return newList;
    }
    public static List<String> transformedList(List<String> list, Function <String, String> function) {
    	List<String> newList = new ArrayList<String>();
    	for (int i = 0; i < list.size(); i++) {
    		newList.add(function.transform(list.get(i)));	 			
    	}
    	return newList;
    }
}
