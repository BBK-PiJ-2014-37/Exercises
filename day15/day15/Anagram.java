package day15;
import java.util.List;
import java.util.ArrayList;

public class Anagram {

	public static List<String> anagrams(String str) {
		List<String> result = new ArrayList<String>();
		if (str.length() == 1) {
			result.add(str);
			return result;
		}
		for (int i = 0; i < str.length(); i++) {
			String first = "" + str.charAt(i);
			String rest = str.substring(0, i) + str.substring(i+1, str.length());
			for (String subanagram: anagrams(rest)) {
				result.add(first + subanagram);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(anagrams("caracol").toString());
	}
}
