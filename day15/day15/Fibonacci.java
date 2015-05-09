package day15;

public class Fibonacci {
	private static int count;

	public static int fib(int n) {
		count ++;
		if (n < 2) return 1;
		return fib(n-1) + fib (n-2);
	}	

	public static int fibMemo (int n) {
		int[] precalculated = new int[n+1];
		return fibMemoHelper(n, precalculated);
	}

	private static int fibMemoHelper(int n, int[] precalculated) {
		count ++;
		if (precalculated[n] == 0) {
			if (n < 2) {
				precalculated[n] = 1;
			} else {
				precalculated[n] = fibMemoHelper(n-1, precalculated) + fibMemoHelper(n-2, precalculated);
			}
		}
		return precalculated[n];				
	}

	static int fibPro(int n) {
		if (n < 2) {
			return 1;
		}
		return fibProHelper(n-2, 1, 1);
	}

	static int fibProHelper(int n, int f1, int f2) {
		count++;
		if (n == 0) return f1 + f2;
		else return fibProHelper(n-1, f1+f2, f1);
	}

	public static void main (String[] args) {
		System.out.println(fibMemo(35) + "(" + count + ")");
		count = 0;
		System.out.println(fib(35) + "(" + count + ")");
		count = 0;
		System.out.println(fibPro(35) + "(" + count + ")");
	}
}