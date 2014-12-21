package day7;

class PatientDouble {
    String name;
    int age;
    String illness;
    PatientDouble nextPatient;
    PatientDouble prevPatient;
	

    public PatientDouble (String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.illness = illness;
	this.nextPatient = null;
	this.prevPatient = null;
    }

    public PatientDouble getNext() {
	return nextPatient;
    }

    public PatientDouble getPrev() {
	return prevPatient;
    }

    public void setNext(PatientDouble patient) {
	this.nextPatient = patient;
    }

    public void setPrev(PatientDouble patient) {
	this.prevPatient = patient;
    }

    public String toString() {
	return this.name + ", " + this.age + ", "+ this.illness;
    }

}

class PatientDoubleList {
    PatientDouble head;

    public void addPatient(PatientDouble newPatient) {
   		if (head != null) {
   			newPatient.setNext(head);
			head.setPrev(newPatient);
			head = newPatient;
		} else {
   			head = newPatient;
   		}
   		
    }

    public boolean delPatient(PatientDouble patient) {
		if (head == patient) {
	    	head = head.getNext();
	    	patient.setNext(null);
	    	head.setPrev(null);
	    	return true;
		}
		PatientDouble p = head.getNext();
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
		PatientDouble p = head;
		while (p != null) {
	    	i++;
	    	p = p.getNext();
		}
		return i;
    }

    public void prettyPrint() {
		PatientDouble p = head;
		PatientDouble last = head;
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
    static PatientDoubleList patients = new PatientDoubleList();
	
    public static void main (String[] args){
	PatientDouble first = new PatientDouble("Maryann", 76, "Meningitis");
	patients.addPatient(first);
	patients.prettyPrint();
	patients.addPatient(new PatientDouble("Mary", 66, "Meningitis"));
	patients.prettyPrint();
	patients.addPatient(new PatientDouble("Lily", 65, "Tuberculosis"));
	patients.prettyPrint();
	PatientDouble mid = new PatientDouble("Louis", 26, "Meningitis");
	patients.addPatient(mid);
	patients.prettyPrint();
	patients.addPatient(new PatientDouble("Carlos", 15, "Meningitis"));
	patients.prettyPrint();
	patients.addPatient(new PatientDouble("Peter", 36, "Tuberculosis"));
	patients.prettyPrint();
	patients.addPatient(new PatientDouble("Ann", 36, "Meningitis"));
	patients.prettyPrint();
	PatientDouble last = new PatientDouble("Kelly", 33, "Tuberculosis");
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

