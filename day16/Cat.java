import java.io.*;

public class Cat {
	
	public static void main (String[] args) {
		for(int i=0; i<args.length; i++){
    		BufferedReader in = null;
	    	try{
	    		File newFile = new File(args[i]);
	    		in = new BufferedReader(new FileReader(newFile));
	    		String line;
	    		while((line = in.readLine()) != null) {
					System.out.println(line);
				}
			} catch(FileNotFoundException ex){
				System.out.println("File " + args[i] + " does not exist.");
			} catch(IOException ex) {
				ex.printStackTrace();
			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
	    }
	}
}
