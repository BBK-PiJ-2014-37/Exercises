public class Mark {
	private static int studentCount = 0;
	private static int distintion = 0;
	private static int passes = 0;
	private static int failed = 0;
	private static int invalid = 0;
	int mark; 


	public Mark(int m) {
		this.mark = m;
		studentCount++;
	}
// it's not counting the number os students
	public static void main(String[] args) {
		System.out.println("Input a mark. Finish with -1.");
		String mark;
		do {
			mark = System.console().readLine();
			int m = Integer.parseInt(mark);
			if (m >= 70 && m <= 100) {
				distintion++;
			} else if (m >= 50){
				passes++;
			} else if (m >= 0) {
				failed++;
			} else {
				invalid++;
			}

		} while (!mark.equals("-1"));
		System.out.println("There are " + studentCount + " students: " + 
			distintion + " distintions, " + passes + " passes, " + failed + "fails, " + " plus " + invalid);

	}
}

