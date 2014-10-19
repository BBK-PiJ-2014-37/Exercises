public class Calculator {
	//private int a;
	//private int b;
	 Calculator()
	 {

	 }

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void substract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println((double) a / b); 
	}
	

	public void modulus(int a, int b) {
		System.out.println(a % b);
	}
}