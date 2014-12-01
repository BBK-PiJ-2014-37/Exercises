import java.util.Arrays;

public class ArrayComparator {


	public static void main(String[] args) {
		String[] myArray = {"cat", "house", "Matilda", "water", "arrow", "villains"};
		Arrays.sort(myArray, (s1,s2) -> s1.length() - s2.length());
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray, (s1,s2) -> s2.length() - s1.length());
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray, (s1,s2) -> ((int)s1.charAt(0) - (int)s2.charAt(0)));
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray, (s1, s2) -> {boolean s1HasE = s1.contains("e"); boolean s2HasE = s2.contains("e");	if (s1HasE == s2HasE) {return 0;} if (s1HasE) {return -1;} return 1;});
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray, (s1, s2) -> ArrayComparator.eChecker(s1, s2));
		System.out.println(Arrays.toString(myArray));
		for (int i = 1; i < myArray.length; i++) {
			if ((eChecker(myArray[i-1], myArray[i]) == 1)) {
				String temp = myArray[i-1];
        		myArray[i-1] = myArray[i];
        		myArray[i] = temp;
			}
		}
		System.out.println(Arrays.toString(myArray));
	}

	public static int eChecker(String s1, String s2) {
		boolean s1HasE = s1.contains("e");
		boolean s2HasE = s2.contains("e");
		if (s1HasE == s2HasE) {
			return 0;
		} 
		if (s1HasE) {
			return -1;
		} 
		return 1;
	}
}