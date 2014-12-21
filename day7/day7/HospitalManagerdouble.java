package day7;
class Patient {
    String name;
    int age;
    String illness;
    Patient nextPatient;
    Patient prevPatient;
	

    public Patient (String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.illness = illness;
	this.nextPatient = null;
	this.prevPatient = null;
    }

    public Patient getNext() {
	return nextPatient;
    }

    public Patient getPrev() {
	return prevPatient;
    }

    public void setNext(Patient patient) {
	this.nextPatient = patient;
    }

    public void setPrev(Patient patient) {
	this.prevPatient = patient;
    }

    public String toString() {
	return this.name + ", " + this.age + ", "+ this.illness;
    }

}

class PatientList {
    Patient head;

    public void addPatient(Patient newPatient) {
   		if (head != null) {
   			newPatient.setNext(head);
			head.setPrev(newPatient);
			head = newPatient;
		} else {
   			head = newPatient;
   		}
   		
    }

    public boolean delPatient(Patient patient) {
		if (head == patient) {
	    	head = head.getNext();
	    	patient.setNext(null);
	    	head.setPrev(null);
	    	return true;
		}
		Patient p = head.getNext();
		while (p != null) {
	    	if (p == patient) {
				p.getPrev().setNext(p.getNext());
				if (p.getNext() != null) {
					p.getNext().setPrev(p.getPrev());
				}
				p.setNext(null);
				p.setPrev(null);
				return true;
	    	}
	    	p = p.getNext();
		}
		return false;
    }

    public int countPatients() {
		int i = 0;
		Patient p = head;
		while (p != null) {
	    	i++;
	    	p = p.getNext();
		}
		return i;
    }

    public void prettyPrint() {
		Patient p = head;
		Patient last = head;
		System.out.print("Patients:\n");
		while (p != null) {
		    System.out.print("  " + p + "\n");
	    	last = p;
	    	p = p.getNext();
		}
		while (last != null) {
			System.out.print("  " + last + "\n");
	    	last = last.getPrev();
		}
    }

}

public class HospitalManagerdouble {
    static PatientList patients = new PatientList();
	
    public static void main (String[] args){
	Patient first = new Patient("Maryann", 76, "Meningitis");
	patients.addPatient(first);
	patients.prettyPrint();
	patients.addPatient(new Patient("Mary", 66, "Meningitis"));
	patients.prettyPrint();
	patients.addPatient(new Patient("Lily", 65, "Tuberculosis"));
	patients.prettyPrint();
	Patient mid = new Patient("Louis", 26, "Meningitis");
	patients.addPatient(mid);
	patients.prettyPrint();
	patients.addPatient(new Patient("Carlos", 15, "Meningitis"));
	patients.prettyPrint();
	patients.addPatient(new Patient("Peter", 36, "Tuberculosis"));
	patients.prettyPrint();
	patients.addPatient(new Patient("Ann", 36, "Meningitis"));
	patients.prettyPrint();
	Patient last = new Patient("Kelly", 33, "Tuberculosis");
	patients.addPatient(last);
	patients.prettyPrint();
	patients.delPatient(mid);
	patients.prettyPrint();
	patients.delPatient(first);
	patients.prettyPrint();
	patients.delPatient(last);
	patients.prettyPrint();
    }

}
