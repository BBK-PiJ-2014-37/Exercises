public class Average {

	public static int getValidInput(String message) {
		while (true) {
			try {
				System.out.println(message);
				String str = System.console().readLine();
				return Integer.parseInt(str);

			} catch (NumberFormatException ex) {
				System.out.println("Your did not enter an integer");
			}
		}
	}
	
	public static void main (String[] args) {
		int i = 0;
		int t = 0;
		int n = getValidInput("How many numbers do you want to enter?");
		while(i < n) {
			int inputValid = getValidInput("Enter a number");
			t += inputValid;
			i++;
		}
		System.out.println("The average is: " + t/n);		
	}
}