public class HashUtilities {
	public static final int MAX_HASH = 1000;

	public static int shortHash(int n) {
		return Math.abs(n % MAX_HASH);

	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Give me a string and I will calculate its hash code");
			String str = System.console().readLine();
			int hash = str.hashCode();
			int smallHash = HashUtilities.shortHash(hash);
			System.out.println("0 < " + smallHash + " < " + MAX_HASH);
		}
	}
}