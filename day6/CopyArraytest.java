public class CopyArraytest {
	public static void main(String[] args) {
		int[] test1 = {1,2,3,4};
		int[] test2 = {5,6,7,8};
		int[] test3 = {1,2,3,4,5,6};
		int[] test4 = {7,8};
		ArrayCopier test = new ArrayCopier();
		test.copy(test1, test2);
		printArray(test1);
		printArray(test2);
		test.copy(test3, test4);
		printArray(test3);
		printArray(test4);
		test.copy(test4, test1);
		printArray(test4);
		printArray(test1);
	}

	public static void printArray(int[] a) { 
        if (a.length == 0) {
           	System.out.println("[]");
        } else {
           	String s = "[";
           	for (int i = 0; i < a.length - 1; i++) {
           	s = s + a[i] + ",";
        	} 
        s += a[a.length-1] + "]";
        System.out.println(s);
    	}
	}
}
