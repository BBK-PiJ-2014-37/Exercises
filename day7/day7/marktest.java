package day7;
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
		System.out.println("There are " + studentCount + " students: " + distintion + " distintions, " + passes + " passes, " + failed + "fails, " + " (plus " + invalid +").");

}