package day12;
public class GetInitials {

	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0).equals("")) {
				String nextInitial = "" + words[i].charAt(0);
				//String nextInitial = "" + words[i].charAt(0); 
			} else {
				result = result + nextInitial.toUpperCase();
			}

		}
	return result;
	}
}