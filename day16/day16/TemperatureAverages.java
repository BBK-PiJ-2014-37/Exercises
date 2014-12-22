package day16;
import java.io.*;

public class TemperatureAverages {
	
	public static void main (String[] args) {
		for(int i=0; i<args.length; i++){
    		BufferedReader in = null;
	    	try{
	    		File newFile = new File(args[i]);
	    		in = new BufferedReader(new FileReader(newFile));
	    		String line;
	    		Double total = 0.0;
	    		int totalCounter = 0;
	    		int lineCounter = 0;
	    		while((line = in.readLine()) != null) {
					String[] lineArray = line.split(",");
					Double t = 0.0;
					for (int j= 0; j < lineArray.length ; j++) {
						try {
							t += Double.parseDouble(lineArray[j]);
						} catch (NumberFormatException ex) {
							System.out.println("Not a number: " + lineArray[j]);
						}
					} 
					lineCounter++;
					totalCounter += lineArray.length;
					total += t;
					System.out.println("Temperature Average line: " + lineCounter + ": " + t/lineArray.length);
				}
				System.out.println("Total temperature average: " + total/totalCounter);
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
