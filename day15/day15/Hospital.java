package day15;
import java.util.*;

public class Hospital {

	public static void main (String[] args) {
		LinkedList<Patient> listPatients = new LinkedList<Patient>();
		listPatients.add(new Patient("John", 33));
		listPatients.add(new Patient("Mary", 133));
		listPatients.add(new Patient("Caroline", -10));
		listPatients.add(new Patient("Luc", 43));
		listPatients.add(new Patient("Daniel", 83));
		listPatients.add(new Patient("Abby", 25));
		System.out.println(listPatients.toString());
	}

}