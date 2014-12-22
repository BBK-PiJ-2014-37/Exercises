package day14;
public class Anagram {
	public List<String> combinator(String str) {
		if (str.size() == 0) {
			return ArrayList<String>();
		}
		result = new ArrayList<String>();
		for (int i = 0; i < str.size(); i++) {
			char thisChar = str.charAt(i);
			String rest = ""; /* str minus the char */
			List<String> subAnagram = combinator(rest);
			for (int j = 0; j < subAnagram.size()) {
				result.add(thisChar.toString() + subAnagram.get(j));
			}
		}
	}

}