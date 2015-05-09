package day14;

public class Sentence {
	private String text;

	public Sentence(String text) {
		this.text = text;
	}

	public boolean isPalindrome () {
		int textLength = text.length();
		
		if (textLength <= 1) return true;
		Character first = Character.toLowerCase(text.charAt(0));
		Character last = Character.toLowerCase(text.charAt(textLength -1));

		if (Character.isLetter(first) && Character.isLetter(last)) {
			if (first == last) {
				Sentence shortSentence = new Sentence(text.substring(1, textLength -1));
				return shortSentence.isPalindrome();
			}
			return false;
		}

		if (!Character.isLetter(first)) {
			Sentence shortSentence = new Sentence(text.substring(1, textLength));
			return shortSentence.isPalindrome();
		} else {
			Sentence shortSentence = new Sentence(text.substring(0, textLength-1));
			return shortSentence.isPalindrome();
		}
		
	}

	public static void main (String[] args) {
		Sentence palindrome = new Sentence("Madam, I'm Adam");
		if (palindrome.isPalindrome()) {
			System.out.println ("\"" + palindrome.text + "\"" + " is a palindrome.");
		} else {
			System.out.println ("It should be a palindrome");
		}
		Sentence palindrome2 = new Sentence("madam");
		if (palindrome2.isPalindrome()) {
			System.out.println ("\"" + palindrome2.text + "\"" + " is a palindrome.");
		} else {
			System.out.println ("It should be a palindrome");
		}
	}
}