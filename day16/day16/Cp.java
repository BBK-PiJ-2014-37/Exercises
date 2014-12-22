package day16;
import java.io.*;

public class Cp {
	
	public static void main (String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try{
	    	File originFile = new File(args[0]);
			File destinFile = new File(args[1]);
	    	in = new BufferedReader(new FileReader(originFile));
	    	out = new PrintWriter(destinFile);
	    	String line;
	    	while((line = in.readLine()) != null) {
					out.println(line);
			}
		} catch(FileNotFoundException ex){
			System.out.println("File " + args[0] + " does not exist.");
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

