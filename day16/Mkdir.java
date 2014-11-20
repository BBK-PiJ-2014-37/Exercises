import java.io.*;
import java.util.Arrays;

public class Mkdir {
	
	public static void main (String[] args) {
		File newFile = new File(args[0]);
		newFile.mkdir();
	}
}