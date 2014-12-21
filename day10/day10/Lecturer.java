package day10;
public class Lecturer extends Teacher {

	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
}

public static void main (String[] args) {
		Lecturer nl = new Lecturer("John White");
		nl.teach("biology");
		nl.doResearch("genetic");
	}