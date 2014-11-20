import java.io.*;
import java.util.Arrays;

public class Ls {
	
	public static void main (String[] args) {
		System.out.println(Arrays.toString(new File(".").list()));
	}

}