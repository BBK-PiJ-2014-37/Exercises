import java.util.ArrayList;

public class AnagramRec {
	private String word;

	public AnagramRec(String word){
		this.word = word;
	}

	public ArrayList<String> combinator() {
		ArrayList<String> combinations = new ArrayList<String>();
 		
		if (word.length() == 0) {
			combinations.add(this.word);
			return combinations;
		}

		for (int i = 0; i < word.length(); i++) {
			String rest = "" + word.substring(0, i-1) + word.substring(i+1, word.length() -1); 
			AnagramRec subAnagram = new AnagramRec(rest);
			ArrayList<String> shortercombinator = subAnagram.combinator();
			for (String s: shortercombinator) {
				combinations.add(word.charAt(i) + s);
			}
		}
		return combinations;
	}

	public static void main (String[] args) {
		AnagramRec myAnagram = new AnagramRec("eat");
		System.out.println(myAnagram.combinator().toString());

	}


}